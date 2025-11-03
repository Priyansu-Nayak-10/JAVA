import java.util.Scanner;
public class P13_RevRightAlignTri {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=sc.nextInt();

        for(int i=row;i>=1;i--){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
