package patterns;

public class hollow_butterfly {
    public static void main(String[] args) {
        int n = 5;

        //Upper half.
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){   // printing left pyramid.
                
                if(i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j =1;j<=2*(n-i);j++){  // printing spaces.
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){   // printing right pyramid.
                if(i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println("");
        }
        // lOWER HALF.
        for(int i = n;i>=1;i--){
            for(int j =1;j<=i;j++){      // printing left bottom pyramid.
                if(i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j =1;j<=2*(n-i);j++){   // printing spaces.
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){    // printing right bottom pyramid.
                if(i==j||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println("");
        }
    }
}
