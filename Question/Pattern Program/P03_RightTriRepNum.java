//Right triangle repeated numbers
import java.util.Scanner;
public class P03_RightTriRepNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=7;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
