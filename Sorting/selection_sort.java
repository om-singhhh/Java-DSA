
import java.util.*;
public class selection_sort {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
