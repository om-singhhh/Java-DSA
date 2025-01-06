package functions;
import java.util.*;
public class multiply {

    public static int calculateMultiply(int a , int b) {
        int ans = a*b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        int ans = calculateMultiply(a,b);
        System.out.println(ans);
        sc.close();
    }
}
