
import java.util.*;
public class Linear_Search {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Found");
        else System.out.println("Not Found");
        in.close();
    }
}
