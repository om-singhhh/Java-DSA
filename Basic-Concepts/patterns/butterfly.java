
public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){  // for outer loop.
            for(int j = 1;j<=i;j++){   // for left top.
                System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){  // for hollow space.
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){    // for right top.
                System.out.print("*");
            }
        System.out.println("");
        }
        for(int i = n;i>=1;i--){  // for outer loop.
            for(int j = 1;j<=i;j++){   // for left bottom.
                System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){  // for hollow space.
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){    // for right bottom.
                System.out.print("*");
            }
        System.out.println("");
        }
        
    }
}
