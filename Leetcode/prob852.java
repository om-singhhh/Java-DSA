public class prob852 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,2};
        System.out.println(bs(arr));
    }
    static int bs(int [] arr){
        int s= 0;
        int e = arr.length - 1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){


                // Binary search me peak element (Mountain Array problem) nikalte waqt jab condition `arr[mid] > arr[mid+1]` true hoti hai, to iska matlab hota hai ki hum ya to **peak par hi khade hain** ya phir **peak ke right se left ki taraf aa chuke hain**. Is situation me `mid` khud bhi valid answer ho sakta hai, isliye search space ko reduce karte waqt `e = mid` use karna logically sahi hota hai. Agar hum `e = mid - 1` use karte hain, to hum galti se `mid` ko search space se hata dete hain, jabki wahi actual peak ho sakta hai; isse algorithm ki correctness guarantee break ho jati hai, chahe kuch specific test cases me output sahi aa jaye. Binary search ka main focus hamesha correctness aur invariant ko maintain karna hota hai, na ki iterations ki sankhya kam karna, kyunki dono approaches ka time complexity O(log n) hi rehta hai. Isi liye interviews aur standard solutions me `e = mid` approach ko hi best aur safe maana jata hai.

                e = m;
            }
            else{
                // Binary search me jab condition `arr[mid] < arr[mid+1]` true hoti hai, to iska matlab hota hai ki hum **mountain array ke ascending part par hain**, yani values abhi badh rahi hain aur peak abhi aage (right side) aani baaki hai. Is case me `mid` kabhi bhi peak nahi ho sakta, kyunki uske turant baad wali value usse badi hai. Isliye `mid` aur usse left ka poora hissa safely discard kiya ja sakta hai, aur search space ko reduce karne ke liye `s = mid + 1` use kiya jata hai. Ye step binary search ke invariant ko maintain karta hai aur ensure karta hai ki hum hamesha us region me search kar rahe hain jahan peak element hone ki guarantee hoti hai.


                s=m+1;
            }
        }
        return s;
    }
}
