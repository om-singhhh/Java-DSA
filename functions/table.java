package functions;
import java.util.*;

public class table{
    public static void tableGenerate(int n) {
        for(int i =1;i<=10;i++){
            int x = n*i;
            System.out.println(n+"*"+i+"="+x);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       tableGenerate(n);
       sc.close();
    }
}