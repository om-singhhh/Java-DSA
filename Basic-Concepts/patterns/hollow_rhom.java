
public class hollow_rhom {
    public static void main(String[] args) {
        int n= 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){  // for starting space.
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                if(i==1||i==n||i+j==1||i+j==n){
                    System.out.print(""+"*"+"");   //  In hollow figures spaces matter on every point if we give any extra space in it then it disrupts the figure or it's alignment.
                }else{
                    System.out.print(" "); // for hollow space.
                }
            }

        System.out.println("");
        }
    }
}
// but in solid figure it does not matter by adding spaces because all spaces are occupied by any entity. or any symbol..
