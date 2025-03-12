package functions ;

public class factorial{
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }
    public static int fact(int a){
        int f = 1;
        for(int i= 1;i<=a;i++){
            f = f*i;
        }
        return f;
    }
}