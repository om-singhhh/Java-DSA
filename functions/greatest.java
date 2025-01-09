// package functions;
// import java.util.*;
// public class greatest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter how many numbers:");
//         int t= sc.nextInt();
//         if(t<2){
//             System.out.println("Not Comparable");
//         }
//         else{
//             int min_value = 0;
//             for(int i=1;i<=t;i++){
//                 System.out.print("Enter the number");
//                 int n=sc.nextInt();   
//                 if(n>min_value){
//                     min_value=n;
//                 }   
//             }
//             System.out.println("The greatest number are="+min_value);

//         }
//         sc.close();
//     }
// }
package functions;
import java.util.Scanner;

public class greatest {
    
    // Function to find the greatest number
    public static int findGreatest(int count, Scanner sc) {
        int greatest = Integer.MIN_VALUE; // r value
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n > greatest) {
                greatest = n; // Update the greatest number
            }
        }
        
        return greatest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many numbers: ");
        int t = sc.nextInt();
        
        if (t < 2) {
            System.out.println("Not Comparable");
        } else {
            int greatest = findGreatest(t, sc); // Call the function to find the greatest number
            System.out.println("The greatest number is: " + greatest);
        }
        
        sc.close();
    }
}
