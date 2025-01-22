package leetcodeQues;
public class fib{
    public static void main(String[] args) {
        int n = 3;
        int f =0;
        int l =1;
        for(int i=0;i<n;i++){
           
            int thirdTerm=f+l;
            f = l;
            l=thirdTerm;
        }
        System.out.println(f);
    }
}