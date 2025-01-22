import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows");
        int row =sc.nextInt();
        System.out.print("enter the colou");
        int col =sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.print("enter the number to find");
        int x = sc.nextInt();
        System.out.print("enter the matrix");
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            } 
        }
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==x){
                    System.out.println(i+j);
                }
            }
            System.out.println("");
        }
        
        sc.close();
    }
}

