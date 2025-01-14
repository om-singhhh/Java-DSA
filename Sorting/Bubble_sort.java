
import java.util.*;
public class Bubble_sort {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            boolean flag = true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    flag = false;
                    break;
                }
            }
            if(flag) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
