import java.util.*;
public class table_loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the table no.:");
        int num = sc.nextInt();
        System.out.print("Enter the table multiple.:");
        int mul =sc.nextInt();
        int tab = 0;
      
        for (int i = 1; i<=mul;i++){
            tab = num*i;
            System.out.println(num+"*"+i+"="+tab);
        }
       
        sc.close();
    }
}
