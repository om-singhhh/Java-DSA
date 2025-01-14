// take a string  from user  and count all the vowel from the string.


import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String v = sc.nextLine();
        int c =0;
        for(int i= 0;i<v.length();i++){
            if(v.charAt(i)=='a'|| v.charAt(i)=='e'|| v.charAt(i)=='i'||v.charAt(i)=='o'|| v.charAt(i)=='u'||v.charAt(i)=='A'|| v.charAt(i)=='E'|| v.charAt(i)=='I'||v.charAt(i)=='O'|| v.charAt(i)=='U'){
                c++;
            }
        }System.out.println("The number of vowels in the string are : "+c);


        sc.close();
    }
}
// char[] ch = s.tochar Array();
