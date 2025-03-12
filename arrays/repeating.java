package arrays;

import java.util.*;

public class repeating {
    public static void main(String[] args) {
        int ans = -1;
        int arr[] = { 1, 5, 3, 4, 6, 3, 4,6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    
                }
            }
            // if (ans != -1) { 
            //     break;
            // }

        }
        System.out.println(ans);
    }
}

// use break  condition for first element unique.......
