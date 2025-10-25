import java.util.Scanner;
public class AlphabetTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row=sc.nextInt();
        System.out.print("Enter the character: ");
        char ch=sc.next().charAt(0);

        for(int i=1;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }
    }
}
