public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int[] nums, int target, boolean findIndex) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2; 

            if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                ans = mid;
                if (findIndex) {
                    e = mid - 1; // keep searching left
                } else {
                    s = mid + 1; // keep searching right
                }
            }
        }
        return ans;
    }

    // main method to run locally
    public static void main(String[] args) {
        FirstAndLast obj = new FirstAndLast();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
