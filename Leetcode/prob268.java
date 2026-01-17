// https://leetcode.com/problems/missing-number/description/ ; 
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        // we have given that we have to find a missing nnumber from the given range.. using bimnary search !!!
        Arrays.sort(nums);
        // here we get it range is from 0 till n means if we any nums[i] its mid position is also equals to its value 
        // if it is nums[mid]>mid means missing number in left ,, if mid == nums[mid] means it will on the right half.
        int s = 0;
        int e = nums.length;
        while(s < e){
            int mid = s + (e - s)/2;
            if(nums[mid]>mid){
                e = mid;
            }
            else if(nums[mid]==mid){
                s = mid + 1;
            }
        }
        return s;


    }

    static int bruteForce(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        int temp = total;

        for (int i = 0; i <= nums.length - 1; i++) {
            temp = temp - nums[i];

        }
        return temp;
    }
}