

public class first {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==0){  // base case
            return 1;
        }
        // recursive call
        int x = fact(n-1);

        // small calculation
        return n*x;
    }
}