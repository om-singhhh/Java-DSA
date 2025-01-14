
import java.util.*;
public class Binary_Search {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();

        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target) {
                System.out.println("Found");
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else if(arr[mid]<target) lo = mid+1;
        }

        System.out.println("Not Found");
    }
}
