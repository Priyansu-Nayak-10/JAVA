import java.util.Scanner;
public class SolidDiamond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row-1;i>=1;i--){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
