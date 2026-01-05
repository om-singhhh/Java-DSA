package Leetcode;
public class prob852 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,2};
        System.out.println(bs(arr));
    }
    static int bs(int [] arr){
        int s= 0;
        int e = arr.length - 1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                e = m-1;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}
