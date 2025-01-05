import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        if(m%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    n.close(); 
    }

}
