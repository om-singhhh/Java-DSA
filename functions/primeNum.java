package functions;
import java.util.*;
public class primeNum {
    public static void prime(int n) {
        if(n%1==0 && n%n==0 && n%100==0){
            System.out.println("The number is prime number:");
        }else{
            System.out.println("This number is not prime number:");
        }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        prime(n);
        sc.close();
    }
    
}
