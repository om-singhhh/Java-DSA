public class prob1672 {
    // LeetCode 1672: Richest Customer Wealth
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int wealth : customer) sum += wealth;
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        // example usage
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        System.out.println(maximumWealth(accounts)); // expected 6
    }
}