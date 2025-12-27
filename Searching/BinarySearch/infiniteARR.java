package Searching.BinarySearch;
// basically it is a type o sliding window approach where we keep increasing the window size exponentially until we find the target element within the range of the window. Once we have found the range, we can apply binary search within that range to find the target element efficiently.
public class infiniteARR {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int ans = findStart(arr,target);
        System.out.println("Element found at index: " + ans);
    }
    
    // this function is for running binary search on the found window 
    static int binarySearch(int[] arr,int target,int l,int h){
        while(l<=h){
            int mid = l + (h-l)/2;
            
            
            if(target<arr[mid]){
                h= mid-1;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                return mid;
            }
        }
        return l;
    }

    // this function founds the range of window wher the target is present if the target is not present it will return the place where it can be inserted
    // in the sorted array.
    static int findStart(int[]arr, int target){  
        int l=0;
        int h=1;
        while(target>arr[h]){
            int newl=h+1;
            h = h + (h-l+1)*2;
            l=newl;
        }
        return binarySearch(arr,target,l,h);
    }
}
