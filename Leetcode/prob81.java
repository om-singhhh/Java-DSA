// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/ ;
public class prob81 {
    
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums, target, 0, nums.length - 1); // normal binary search means array is not rotated.
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        else return binarySearch(nums,target,pivot+1,nums.length-1);
    }
   
    static int findPivot(int[]nums){
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            // int ans  = nums[mid];
            int mid = s + (e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>s && nums[mid]<nums[mid-1]){
                return mid -1;
            }
            if(nums[s]==nums[e]){
                if(s < e && nums[s]>nums[s+1]){
                    return s + 1;
                }
                s++;
                if(e>s && nums[e]<nums[e-1]){
                    return e - 1 ;
                }
                e--;
            }
            // left side is sortd so pivot should be in right.
            else if(nums[s]<nums[mid] || (nums[s]==nums[mid] && nums[mid]>nums[e])){
                s = mid +1;
            }
            else{
                e = mid;
            }
            
        }
        return -1;
        
    }
      static boolean binarySearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        prob81 p = new prob81();
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(p.search(arr, target));
    }
}

