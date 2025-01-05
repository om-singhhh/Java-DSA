// package patterns;

// public class hollow_dia {
//     public static void main(String[] args) {
//         int n =5;
//         for(int  i =1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j =1;j<=i;j++){
//                 if(i==1||i==n||j==1){ 
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int j=2;j<=i;j++){
//                 if(i==1||i==n||j==i){ 
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");

//         } 
        
//         for(int  i =n;i>=1;i--){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j =1;j<=i;j++){
//                 if(i==1||i==n||j==1){ 
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for(int j=2;j<=i;j++){
//                 if(i==1||i==n||j==i){ 
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");

//         } 
//     }
// }

// package patterns;
// import java.util.*;
// public class hollow_dia {
//     public static void main(String[] args) {
//         // int n = 4;
//         int count=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no. of rows:");
//         int n = sc.nextInt();
//         //upper half portion of diamond.
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){ // for spaces.
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=count+i;j++){  // for printing stars.
//                 System.out.print("*");
//             }
//             count++;
//             System.out.println("");
//         }
//          //lower half portion of diamond.
//         for(int i = n;i>=1;i--){
//             for(int j = 1;j<=n-i;j++){ // for spaces.
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<count+i;j++){  // for printing stars.
//                 System.out.print("*");
//             }
//             count--;
//             System.out.println("");
//         }  
//         sc.close();
//     }
// }

// package patterns;

// public class HollowDiamond {
//     public static void main(String[] args) {
//         int n = 5;

//         // Upper half of the diamond
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" "); // Leading spaces
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1) { 
//                     System.out.print("*"); // Left edge of the diamond
//                 } else if (j == i) {
//                     System.out.print("*"); // Right edge of the diamond
//                 } else {
//                     System.out.print(" "); // Hollow part
//                 }
//             }
//             for (int j = 2; j <= i; j++) {
//                 if (j == i) { 
//                     System.out.print("*"); // Right edge continuation
//                 } else {
//                     System.out.print(" "); // Hollow part
//                 }
//             }
//             System.out.println(); // Move to the next line
//         }

//         // Lower half of the diamond
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" "); // Leading spaces
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1) { 
//                     System.out.print("*"); // Left edge of the diamond
//                 } else if (j == i) {
//                     System.out.print("*"); // Right edge of the diamond
//                 } else {
//                     System.out.print(" "); // Hollow part
//                 }
//             }
//             for (int j = 2; j <= i; j++) {
//                 if (j == i) { 
//                     System.out.print("*"); // Right edge continuation
//                 } else {
//                     System.out.print(" "); // Hollow part
//                 }
//             }
//             System.out.println(); // Move to the next line
//         }
//     }
// }
package patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; // Size of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
