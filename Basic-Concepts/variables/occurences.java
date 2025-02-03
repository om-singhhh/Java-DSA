import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("enter the number to find the occurences of ");
        int x =sc.nextInt();
        int count  =0 ;
        while(num>0){
            int r =num%10;
            if(r==x){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}