package functions;
import java.util.*;
public class freqArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the array size:"); 
       int size = sc.nextInt();
       int [] arr = new int[size];
    
       ArrayInput(arr,size,sc);
    //    System.out.println("the given array by user is:"+ Arrays.toString(arr));
        
        int q =sc.nextInt();
        while(q>0){
            int x = sc.nextInt();
            q--;
        }


    }
    public static int[] ArrayInput(int[] arr,int size,Scanner sc){
        
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int[] makefreq(int []freqArr){
        int frequency[] = new int[1000005];
        for(int i = 0;i<freqArr.length;i++){
            frequency[freqArr[i]]++;
        }
        return freqArr;
    }
}
