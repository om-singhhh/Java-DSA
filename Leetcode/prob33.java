
// this code is only for leetcode submission for the rotated sorted array search problem if you have to run locally use main method and give particular array to test
class prob33 {
    static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    
    static int findPivot(int nums[]){
       int s=0;
       int e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m<e && nums[m]>nums[m+1]){
                return m;
            }
            if(m>s && nums[m]<nums[m-1]){
               return m-1;
            }
            if(nums[s]>=nums[m]){
                e =m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums,int target,int s,int e){
        while(s<=e){
            int mid = s + (e-s)/2;
            
            
            if(target<nums[mid]){
                e= mid-1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
