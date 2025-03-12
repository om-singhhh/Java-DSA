package arrays;
import java.util.*;
public class SmallAndLargest {
    public static void main(String[] args){
        int arr [] = {5,4,7,9,3,1};
        Arrays.sort(arr);
    // sorted array check..
    //    for(int i = 0;i<arr.length;i++){
    //         System.out.println(arr[i]+" ");
    //    }
       int ans[] = {arr[0] , arr[arr.length-1]};
       
            System.out.println(ans[0]+ " is smallest ");
            System.out.println(ans[1]+ " is LARGEST ");
       
    }
}
