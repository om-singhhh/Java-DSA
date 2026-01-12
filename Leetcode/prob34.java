
public class prob34 {
    static int firstSearch(int[] arr,int target, boolean findStartIndex){
        int ans = -1;
        int l = 0;
        int h = arr.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(target<arr[mid]){
                h=mid-1;
            }
            else if(target>arr[mid]){
                l =mid +1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    h = mid-1;
                }
                else{
                    l =mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ans = {-1,-1};
        int []nums = {5,7,7,8,8,10};
        int target = 8;
        int startIdx = firstSearch(nums,target,true);
        int endIdx = firstSearch(nums,target,false);
        
        ans[0] = startIdx;
        ans[1] = endIdx;
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
