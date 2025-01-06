package functions;
import java.util.*;
public class Main{
    public static void sumOdd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of Odd numbers is:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sumOdd(n);

        sc.close();
    }
}