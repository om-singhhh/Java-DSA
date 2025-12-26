// In this problem, the key improvement over normal binary search is that the search does not stop after finding the target element. Since the array may contain duplicate values, finding one occurrence is not sufficient. Therefore, when a possible answer is found, the index is stored and binary search is applied again on the remaining part of the array to find a more extreme position. To find the first occurrence, the search continues on the left side of the array, and to find the last occurrence, the search continues on the right side. This approach ensures that the most appropriate index is found while still maintaining the efficiency of binary search with a time complexity of O(log n).





package Searching.BinarySearch;

public class recursiveBS {
    static int firstSearch(int[] arr,int target, boolean findStartIndex){
        int ans = -1;
        int l = 0;
        int h = arr.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(target<arr[mid]){
                h=mid-1;
            }
            else if(target>arr[mid]){
                l =mid +1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    h = mid-1;
                }
                else{
                    l =mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ans = {-1,-1};
        int []nums = {5,7,7,8,8,10};
        int target = 8;
        int startIdx = firstSearch(nums,target,true);
        int endIdx = firstSearch(nums,target,false);
        
        ans[0] = startIdx;
        ans[1] = endIdx;
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}


