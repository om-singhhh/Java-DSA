import java.util.Arrays;

public class prob16 {
    
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = Integer.MAX_VALUE;
        for(int i = 0 ;i<nums.length;i++){
            int j = i+1 ;int k = nums.length-1;
            while(j<k){
                int curr_sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(curr_sum - target) < Math.abs(closest_sum-target)){
                    closest_sum = curr_sum;
                }
                if(curr_sum < target){
                    j++;
                }
                else if(curr_sum > target){
                    k--;
                }
                else{
                    return curr_sum;
                }
            }
        }
        return closest_sum;
    }
}

