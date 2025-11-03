public class P26_StarPyramid {
    public static void main(String args[]){
        int row=6;
        System.out.println("PYRAMID 1");
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID 2");
        for(int i=1;i<=row;i++){
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
