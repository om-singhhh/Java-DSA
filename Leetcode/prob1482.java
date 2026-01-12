public class prob1482 {
    // https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

    class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;
       
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for(int nums : bloomDay){
            s = Math.min(s,nums);
            e = Math.max(e,nums);
        }
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
                if(possible(bloomDay,mid,m,k)){
                    
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            
        }
        return s;
        
    }
    public boolean possible(int [] bloomDay, int day,int m,int k){
        
        int count = 0; int noOfBou = 0;
        for(int cnt : bloomDay){
            if(cnt <= day){
                count++;
            }
            else{
                noOfBou += count/k;
                count  = 0 ;
            }
        }
        noOfBou += count/k;
        if(noOfBou >= m){
            return true;
        }
        else{
            return false;
        }
    }
    
}
}
