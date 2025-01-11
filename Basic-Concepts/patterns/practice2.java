import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count =1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            for(int j=i;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(count);
              
            }
        System.out.println("");   
        }
        sc.close();
    }
}
