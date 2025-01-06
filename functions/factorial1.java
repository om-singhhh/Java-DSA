package functions;
import java.util.*;
public class factorial1 {

    public static void factorial(int n) {
        int factorial = 1;
        for(int i =n;i>=1;i--){
            factorial =factorial*i;
        }
        System.out.println(factorial);
        
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n); 
        sc.close();
    }
}
