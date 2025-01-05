// /Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;
public class radius {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        float radius = r.nextFloat();
        float pi = r.nextFloat();
        float area = pi*radius*radius;

        System.out.println(area);
    r.close();
    }
}
