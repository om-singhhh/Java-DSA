
import java.util.*;

public class Reverse_Array {
    public static void rev(int[]arr,int h,int k){
        while (h < k) {
            int temp = arr[h];
            arr[h] = arr[k];
            arr[k] = temp;
            h++;
            k--;
        }
    }
    public static void main(String...args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0;i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
        int[] arr = {10,20,30,40,50,60,70};
//              Methods-1
//        for(int i =0;i<n/2;i++) {
//            int j = n - 1 - i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

//            Methods-2
//        int l=0;
//        int m = n-1;
//        while (l < m) {
//            int temp = arr[l];
//            arr[l] = arr[m];
//            arr[m] = temp;
//            l++;
//            m--;
//        }
        rev(arr , 2,5);
        rev(arr,3,6);

//        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
