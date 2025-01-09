package functions;
import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to replace: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the replacement digit: ");
        int d2 = sc.nextInt();
        String numStr = Integer.toString(num);
        String d1Str = Integer.toString(d1);
        String d2Str = Integer.toString(d2);
        String replacedStr = numStr.replace(d1Str, d2Str);
        int replacedNum = Integer.parseInt(replacedStr);
        System.out.println("Number after replacement: " + replacedNum);
        sc.close(); 
    }
}
