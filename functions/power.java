package functions;
import java.util.*;
public class power {
    public static void powerFunc(int x1,int n1) {
        
        int result = 1;
        for(int i=0; i<n1; i++) {
            result = result * x1;
        }
        System.out.println("x to the power n is : "+ result);
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x");
    int x = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();
    powerFunc(x,n);
    
    sc.close();
    }   
}