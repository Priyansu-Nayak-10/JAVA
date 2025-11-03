import java.util.Scanner;
public class P17_NumPyr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("PYRAMID -1 ");
        System.out.print("Enter the number of row: ");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        System.out.println("PYRAMID -2");
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"   ");
            }
            System.out.println();
        }
    }
}
