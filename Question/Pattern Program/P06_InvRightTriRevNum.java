
import java.util.Scanner;
public class P06_InvRightTriRevNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row;j>=row-i+1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
