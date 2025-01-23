public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int r =0;
        int ans = 0;
        while(n!=0){
            r = n%10;
            ans = r*r*r;
            n = n/10;
        }
        ans+=ans;
        System.out.println(ans);
    }
}
