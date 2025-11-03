import java.util.Scanner;
public class P14_RightAlignRevNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
