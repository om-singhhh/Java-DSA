
import java.lang.reflect.Method;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
interface MountainArray {
    public int get(int index);
    public int length();
}
public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak =peakIdx(mountainArr);
        int ans = bs(mountainArr,target,0,peak);
        if(ans!=-1){
            return ans;
        }
        
        return bs(mountainArr,target,peak+1,mountainArr.length()-1);
    } 
// Method not properly closed
// findInMountainArray() method ke baad closing brace } missing thi, jiski wajah se compiler ne peakIdx() method ko method ke andar likha hua samjha. Java me method ke andar method declare karna allowed nahi hota, isliye illegal start of expression error aaya.

// Incorrect understanding of MountainArray
// MountainArray ek interface API hai, normal array nahi. Isliye MountainArray[] ya mountainArr[index] use karna galat hai. Values access karne ke liye sirf mountainArr.get(index) hi valid hota hai.

// Wrong static API calls
// MountainArray.length() aur MountainArray.get() jaise static calls galat hain. Ye methods object ke through call kiye jaate hain:
// mountainArr.length() aur mountainArr.get(i).

// Method signature typing errors
// bs(MountainArray, int target, ...) jaise incomplete method signatures Java syntax ke according invalid hote hain. Har parameter ka type aur variable name dena zaroori hota hai.

// Code Explanation (Short & Clear)

// Peak Finding (peakIdx)
// Binary search ka use karke mountain array ka peak index nikalte hain.
// Agar arr[mid] > arr[mid+1] ho, to peak left side ya mid par ho sakta hai, isliye end = mid kiya jaata hai.
// Warna peak right side hoti hai, to start = mid + 1 kiya jaata hai.

// Binary Search (bs)
// Pehle check kiya jaata hai ki given range ascending hai ya descending.
// Uske baad normal binary search apply hoti hai, comparison order array ke order ke according adjust kiya jaata hai.

// Main Logic (findInMountainArray)
// Pehle peak index find hota hai, phir target ko pehle left (ascending) part me search kiya jaata hai.
// Agar wahan na mile, to right (descending) part me search kiya jaata hai.
    



    static int peakIdx(MountainArray mountainArr){
        int s=0;
        int e = mountainArr.length()-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1)){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
    static int bs(MountainArray mountainArr, int target,int start,int end){
        

        boolean isAsc;
        if(mountainArr.get(start) < mountainArr.get(end)){
            isAsc = true;
        }
        else{
           isAsc=false;
        }
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            
            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (isAsc) { // ascending order
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending order
                if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Example usage

    }
} 
    

