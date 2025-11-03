public class P18_InvNumPyr {
    public static void main(String args[]){
        System.out.println("PYRAMID 1");
        int row=5;
        for(int i=row;i>=1;i--){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID 2");
        for(int i=row;i>=1;i--){
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
