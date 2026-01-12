public class prob2226 {
    // https://leetcode.com/problems/maximum-candies-allocated-to-k-children/
     public int maximumCandies(int[] candies, long k) {
        int max = candies[0];
        for(int candy:candies){
            max = Math.max(max,candy);
        }
        int min = 1;
        
        while(min<=max){
            int mid = min + (max-min)/2;
            long maxCandy = 0 ;
            for(int can : candies){
                maxCandy += can/mid;
            }
            if(maxCandy>=k){
                
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return max;
    }
}
