

public class palindrome_pyra {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 1;i<=n;i++){ // outer loop.
            for(int j=1;j<=n-i;j++){ // for left spaces.
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){  // for printing numbers in reverse.
                System.out.print(j);
                
            }
            for(int j = 2;j<=i;j++){  // for right part numbers .
                System.out.print(j);
                
            }
            System.out.println(""); // for extra line.
        }
    }
}
