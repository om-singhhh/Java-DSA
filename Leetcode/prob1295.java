
public class prob1295 {
    class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;    
        }
        return count;
    }
    static boolean even(int num){
        int numofDigits=digits(num);
        if(numofDigits%2==0){
            return true;
        }
        return false;
    }

}    public static void main(String[] args) {
        prob1295 obj = new prob1295();
        Solution sol = obj.new Solution();
        int[] nums = {12,345,2,6,7896};
        System.out.println(sol.findNumbers(nums));
    }   
}
