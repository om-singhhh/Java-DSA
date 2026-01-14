package arrays;
public class matrix {

    // Search in a row-wise and column-wise sorted matrix
    // this is a variation of binary search
    //but this is not exactly binary search it is more like a greedy approach or a brute force approach which reduces the search space 
    // Its time complexity is O(n + m) where n is number of rows and m is number of columns.
    // which basically means we are traversing at max n + m elements in the matrix to find the target element
    //Space complexity is O(1) as we are not using any extra space.
    static int[] sortedMatrix(int [][]arr , int target ){
        int r =0;
        int c = arr.length-1;
        while(r<arr.length && c >= 0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c++;
            }
        }
        return new int[]{-1 , -1};
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 5;
        int [] ans = sortedMatrix(arr,target);
        System.out.println("Target found at: [" + ans[0] + ", " + ans[1] + "]");

    }
}

