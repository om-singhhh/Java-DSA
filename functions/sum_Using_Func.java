package functions;
import java.util.*;
public class sum_Using_Func {
    public static int sum(int a,int b) {  // arguments.
        int ans =a+b;
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = sum(a,b);
        System.out.println(ans);
        sc.close();
    }
}
