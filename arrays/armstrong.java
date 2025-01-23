import java.util.*;
public class armstrong {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to check");
        int n = sc.nextInt();
        int ori=n;
        int sum =0;
        while(n!=0){
            int r = n%10;
            n = n/10;
            sum = sum+(r*r*r);
        }
        if(sum==ori){
            System.out.println(ori+" has cubic sum this "+sum+" therefore it is an armstrong number");
        }
        else{
            System.out.println(ori+" has cubic sum this "+sum+" therefore it is not an armstrong number");
        }
        sc.close();
    }
}
