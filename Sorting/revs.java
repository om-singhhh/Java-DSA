

public class revs {
    public static void rev(int[]arr,int h,int k){
        while (h < k) {
            int temp = arr[h];
            arr[h] = arr[k];
            arr[k] = temp;
            h++;
            k--;
        }
    }
    public static void main(String...args){
        int[] arr = {10,20,30,40,50,60,70};
        rev(arr,2,5);
        rev(arr,3,6);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
