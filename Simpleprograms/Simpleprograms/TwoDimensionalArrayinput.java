import java.util.*;
public class TwoDimensionalArrayinput {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int [][]ar=new int[5][5];
        int r,col;
        System.out.println("Enter the number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter the number of columnx: ");
        col=sc.nextInt();
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements in the array is :");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}


