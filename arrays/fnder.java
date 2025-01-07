// Linear Search Concept

package arrays;
import java.util.*;
public class fnder {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();// size of array
       int num[]=new int[n];
       for(int i=0;i<n;i++){
           num[i]=sc.nextInt();
        }
        System.out.print("enter the number to find: ");
        int m = sc.nextInt();
        for(int i =0;i<n;i++){
            if(m==num[i]){
                System.out.println(i);
               }
        }
       sc.close();
    }
}


// Now its getting fun in coding..