package functions;
import java.util.*;
public class average {
    public static void avg_num(int a,int b,int c) {
        int avg = (a+b+c)/2;
        System.out.println("The average of 3 numbers is:"+avg);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a =sc.nextInt(); 
       int b =sc.nextInt(); 
       int c =sc.nextInt(); 
        avg_num(a,b,c);
        sc.close();
    }
}
