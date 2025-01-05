package patterns;

public class hollow_pyra {
    public static void main(String[] args) {
        int n =5;
        for(int  i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                if(i==1||i==n||j==1){ 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++){
                if(i==1||i==n||j==i){ 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        } 
        
        for(int  i =n-1;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                if(i==1||i==n||j==1){ 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=2;j<=i;j++){
                if(i==1||i==n||j==i){ 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        } 
    }
}
