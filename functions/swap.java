package functions;
// import java.util.*;
public class swap {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        // swaps(a,b);
        // swap2(a,b);

        int arr[] = {1,2,3,4,5,6,7};
        // int ans[]= reversed(arr);
        // printArray(ans);
        
        
        // inlineReverse(arr);
        // printArray(arr);
        

        int k = 3;
        int ans[] = rotate1(arr,k);
        printArray(ans);
    }
    public static int[] printArray(int arr[]){
        int [] ans= reversed(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void swaps(int a, int b){
        int temp =a;
        a =b;
        b=temp;
        System.out.println("the value of a after swap is: "+a);
        System.out.println("the value of b after swap is: "+b);
    }
    
    // using sum and difference method swap two values:

    public static void swap2(int a, int b){
        a = a+b;
        b= a - b;
        a= a-b;
        System.out.println("the value of a after swap is: "+a);
        System.out.println("the value of b after swap is: "+b);

    }
// reverse the array method 1::
    public static int[] reversed(int[] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j =0;
        for(int i =n-1; i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }

    // in place reversing the array:
    public static void swapInArray(int[] arr ,int i,int j) {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }

    public static void inlineReverse(int [] arr){
       int n = arr.length;
       int i =0;int j =n-1;
       while(i<j){
        swapInArray(arr,i,j);
        i++;
        j--;
       }
    }
    public static int[] rotate1(int arr[],int k){
        int n = arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j =0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void rotate2(int[] arr,int k){
        
    }
}


