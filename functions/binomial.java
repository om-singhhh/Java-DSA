package functions;

public class binomial {
    public static void main(String[] args) {
        int a = 5;
        int r = 2;
        System.out.println(cofficient(a , r));
    }
    public static int fact(int a){
        int f = 1;
        for(int i= 1;i<=a;i++){
            f = f*i;
        }
        return f;
    }
    public static int cofficient(int a, int r ){
        int n_fact = fact(a);
        int r_fact = fact(r);
        int nr_fact = fact(a-r);
        int bino = n_fact/(r_fact * nr_fact);

        return bino;
    }
}

