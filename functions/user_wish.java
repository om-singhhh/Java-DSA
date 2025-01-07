package functions;
import java.util.*;
public class user_wish {
    public static void main(String[] args) {
        System.out.println("press 1 to start and 0 to continue");
        Scanner sc =new Scanner(System.in);
        int p = 0;int n= 0;int z=0;
        int x = sc.nextInt();
        while(x==1){
            System.out.println("enter your number");
            int num = sc.nextInt();
            if(num>0){
                p++;
            }else if( num<0){
                n++;
            }else{
                z++;
            }
            System.out.println("press 1 to continue or 0 to stop");
                num = sc.nextInt();

        }
        System.out.println("positive"+p);
        System.out.println("negative"+n);
        System.out.println("zero"+z);
    sc.close();
    }
}
