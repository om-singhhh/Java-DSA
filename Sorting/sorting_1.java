
import java.util.*;
public class sorting_1 {
    public static void swap(int [] arr , int l ,int m ) {
        while (l < m) {
            int temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;
        }
    }
    public static void main(String...args){
        int [] arr = {0,0,1,0,1,1,1,1,0,0,1,0,1,0,1,0,1};
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
