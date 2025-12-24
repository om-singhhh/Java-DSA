// 1672 https://leetcode.com/problems/richest-customer-wealth/

package Searching.LinearSearch;

public class richestWealth {
    static int sumOfWealth(int [][]num){
        int max = 0;
        for(int i = 0 ; i<num.length;i++){
            int sum = 0; 
            for(int j = 0;j<num[i].length;j++){
                sum+=num[i][j];
                
            }
            if(sum>max){
                max=sum;
            } 
        }
        return max;
    }
    
    public static void main(String[] args){
        int [][] nums={{1,2,3},{3,4,1}};
        int ans = sumOfWealth(nums);
        System.out.println(ans);
    }
}
