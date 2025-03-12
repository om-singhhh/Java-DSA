package arrays;

import java.util.*;

public class targetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number to find the sumPair: ");
        int target = sc.nextInt();
        int arr[] = { 4, 6, 3, 5, 8, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int newArr[] = { arr[i], arr[j] };
                    System.out.println(Arrays.toString(newArr));
                }
            }
        }
        System.out.println("");
    }
}
