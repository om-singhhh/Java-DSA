package Searching.BinarySearch;

public class ceilingNo {
    static int ceiling(int [] arr,int target){
        int l =0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target<arr[mid]){
                h = mid-1;
            }
            else{
                l= mid+1;
            }
        }
        return arr[h];
    }



    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        int target = 15;
        System.out.print(ceiling(arr,target));
    }
}
