// https://leetcode.com/problems/maximum-subarray/
public class prob53 {
    
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum =0 ;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];

            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
            sum = 0;
            }  
        }
        return maxSum;    
    }
    public static void main(String[] args) {
        // Example usage
        prob53 solution = new prob53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum: " + solution.maxSubArray(nums));
    }
}

