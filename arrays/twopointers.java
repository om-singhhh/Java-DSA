package arrays;
import java.util.*;
public class twopointers {
    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5};
        // System.out.println("sorted Array using two pointers is: ");
        // twopoint(arr);
        // points(arr);
        
        printArray(arr);

    }
    public static void twopoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            // printArray(arr);
        }

    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void points(int[]arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
}
