package Searching.LinearSearch;
import java.util.*;
public class templateCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter the elements of array : ");
        arrayInput(nums);
        System.out.println("The target elements of array are : ");
        int target=sc.nextInt();
        int ans = linearSearch2(nums,target);
        System.out.println("The index of target element is : " + ans);
    }
    // linear Searching code . 
    public static int linearSearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //using enhanced for loop
    public static int linearSearch2(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int index = 0;
        for(int element : arr){
            if(element==target){
                return index;
            }
            index++;
        }
        return -1;
    }



    // array input code..
    static void arrayInput(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();    
        }
    }
}
