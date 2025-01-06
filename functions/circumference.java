package functions;
import java.util.*;
public class circumference {
    public static void circle(float r){
        double pi = Math.PI;
        double circum = 2*pi*r;
        System.out.println(circum);
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float rad=sc.nextFloat();
        circle(rad);
        sc.close();
    }
}
