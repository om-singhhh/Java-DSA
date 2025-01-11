
import java.util.*;
public class diamond {
    public static void main(String[] args) {
        // int n = 4;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        //upper half portion of diamond.
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){ // for spaces.
                System.out.print(" ");
            }
            for(int j = 1;j<=count+i;j++){  // for printing stars.
                System.out.print("*");
            }
            count++;
            System.out.println("");
        }
         //lower half portion of diamond.
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=n-i;j++){ // for spaces.
                System.out.print(" ");
            }
            for(int j = 1;j<count+i;j++){  // for printing stars.
                System.out.print("*");
            }
            count--;
            System.out.println("");
        }  
        sc.close();
    }
}
