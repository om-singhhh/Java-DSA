package Searching.LinearSearch;
import java.util.*;
public class minNumber {
    // using for each loop;
    static int minNum2(int[] arr){
        int number=Integer.MAX_VALUE;
        for(int element:arr){
            if(number>element){
                number=element;
            }
        }
        return number;
    }
    //using normal loop;
     static int minNum(int[] arr){
        int number=Integer.MAX_VALUE;
        // int index=-1;
        for(int i = 0;i<arr.length;i++){
            if(number>arr[i]){
                number=arr[i];
                // index = i;
            }
        }
        return number;
    }
    public static void main(String[] args){
        int [] nums={18,12,3,3 ,14,28};
        int ans = minNum(nums);
        System.out.println(ans);
    }
}
