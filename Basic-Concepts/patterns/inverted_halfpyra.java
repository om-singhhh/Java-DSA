package patterns;

public class inverted_halfpyra {
    public static void main(String[] args) {
        int r = 5;
        
        for(int i= 1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j= 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
