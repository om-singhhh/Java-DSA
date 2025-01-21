package arrays;

public class palindrome {
    public static void main(String[] args) {
        int x =244;
        int ori=x;
        int r =0;
        int rev=0;
        while(x!=0){
            r = x%10;
            rev = rev*10 +r;
            x = x/10;
        }
        if(rev==ori){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
