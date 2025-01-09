package functions;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int r =0;
        int reverse=0;
        while(num!=0){
            r=num%10;
            reverse=reverse*10+r;
            num=num/10;
        }
        System.out.println(reverse);  
        sc.close();  
    }
}
