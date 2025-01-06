package functions;
import java.util.*;
public class greatestNum {
    public static void greater(int n1,int n2){
        if(n1<n2){
            System.out.println(n2+" num2 is greater");
        }else{
            System.out.println(n1 +" num1 is greater");
        }
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int num1=sc.nextInt(); 
       int num2=sc.nextInt(); 
       
       greater(num1,num2);
       
       sc.close();
    }
}
