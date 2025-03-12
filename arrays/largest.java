package arrays;

import java.util.*;
public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,5,1,8,4};
        int k = sc.nextInt();
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. It should be between 1 and " + arr.length);
            
        }
            Arrays.sort(arr);
           
                System.out.println("Kth Largest Element in the array is"+arr[arr.length-k]);
                System.out.println("Kth Smallest Element in the array is"+arr[k-1]);    
                
        sc.close();

    }
}
