public class prob74 {
    
    
    
    
    
    
    
    
    
    
    
    
    
    // brute force approach to search in a 2D matrix. 
    // It takes O(n*m) time complexity where n is number of rows and m is number of columns.
    // but we can do better with binary search approach which takes O(log(n*m)) time complexity.
    public boolean bruteForce(int[][] matrix, int target) {
        for(int i = 0 ;i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
