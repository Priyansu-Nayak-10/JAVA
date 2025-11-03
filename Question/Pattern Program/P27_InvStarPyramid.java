
public class P27_InvStarPyramid {
    public static void main(String args[]){
        int row=6;
        System.out.print("PYRAMID 1");
        for(int i=row;i>=1;i--){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID 2");
        for(int i=row;i>=1;i--){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
