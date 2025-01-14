
import java.util.*;
public class Second_Largest {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
