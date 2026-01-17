// https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        int s = 1;
        int e = nums.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            int cnt = 0 ;
            for(int i =0;i<nums.length;i++){
                if(nums[i]<=mid){
                    cnt++;
                }    
            }
            if(cnt<=mid){
                    s = mid+1;
                }
                else{
                    e = mid;
                }
        }
        return s;
    }
}