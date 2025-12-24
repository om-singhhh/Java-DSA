
// 1295 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package Searching.LinearSearch;
import java.util.*;
public class evenDigits {
    static int findNumbers(int[] nums) {
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
    public static void main(String[] args){
        int [] nums={18,123,456,2,345,6789};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

}
