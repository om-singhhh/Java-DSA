package arrays;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,2,1,3};
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i= 0;i<arr.length;i++){
            if(arr[i]>0){
                int ans = arr[i];
                System.out.println(ans);
            }
        }
    }
}
