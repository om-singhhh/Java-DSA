public class prob74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        // we can solve this using O(log n + log m) , but better approach is also there
        // with O(log(m*n));
        // consider this 2d as a 1d matrix
        int n = matrix.length, m = matrix[0].length;
        int l = 0, h = n * m - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int row = mid / m;
            int col = mid % m;
            if (matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;

    }
    // brute force approach to search in a 2D matrix.
    // It takes O(n*m) time complexity where n is number of rows and m is number of
    // columns.
    // but we can do better with binary search approach which takes O(log(n*m)) time
    // complexity.
    public boolean bruteForce(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
