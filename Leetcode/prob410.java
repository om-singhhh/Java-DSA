
public class prob410 {
    
    public int splitArray(int[] nums, int k) {
        //finding the range firstly;
        int start = 0;
        int e = 0;
        for(int num:nums){
            start=Math.max(start, num);
            e += num;
        }
        
        // binary search 
        while(start<e){
            int mid = start + (e - start)/2;
            //here we use mid to find the subaary limit to divide into pieces means sum greater than mid is not acceptable in subarray
            int sum =0;
            int pieces = 1;
            // to divide the array in subarray we use for loop 
            for (int num : nums){
                if(sum+num > mid){
                    // means that we cannot add this in this subarray
                    // we have to make new subarray
                    sum = num;
                    pieces++;

                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start =mid+1;
            }
            else{
                e = mid ;
            }
        }
        return e;
         
    }
    public static void main(String[] args) {
        // Example usage
        prob410 prob = new prob410 ();
        int[] nums = {7,2,5,10,8};
        int k = 2; 
        int result = prob.splitArray(nums, k);
        System.out.println("The minimized largest sum among the subarrays is: " + result);
    }
}
