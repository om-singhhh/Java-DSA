package functions;

public class prime {
    public static void main(String[] args) {
        // int a = 6;
        // System.out.println(num(a));

        // int n = 100;
        // PrimeInRange(n);

        decibin(17);

    }

    public static boolean num(int a) {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void PrimeInRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (num(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static int decibin(int y) {
        int pow = 0;
        int MyNum = y;
        int ans = 0;
        while (y > 0) {

            int rem = y % 2;
            ans = ans + (rem * (int)Math.pow(10, pow));
            pow++;
            y = y / 2;
            
           
        }
        System.out.println(ans);
        return ans;
    }
}

// basics concepts of bits and its fucntionalities...