

public class amazon {
    public static void main(String[] args) {
        int n = 10;
        int sum = n;
        for(int i =1;i<n;i++){
            for(int j =1;j<n-i;j++){
                System.out.print("0 ");
                if(j==n){
                    System.out.print(n+" ");
                }
            }
            
            
            System.out.println("");
        }
    }
}
