package functions;

public class prime {
    public static void main(String[] args) {
        // int a = 6;
        // System.out.println(num(a));
        
        
        // int n = 100;
        // PrimeInRange(n);
        

        
        
    }
    public static boolean num(int a){
        boolean isPrime= true;
        for(int i = 2;i<a;i++){
            if(a%i==0){
                isPrime = false;
                break;
            }
        }
    return isPrime;
    }
    public static void PrimeInRange(int n){
        
        for(int i =2;i<=n;i++){
            if(num(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}

 
    