package arrays;
public class water {
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange =3;
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int remBottles =numBottles%numExchange;
            ans = ans+newBottles;
            numBottles = newBottles+remBottles;
        }
        System.out.println(ans);
                
    
    }
}

