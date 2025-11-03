public class P11_InvContinuousTri {
    public static void main(String args[]){
        int row=4;
        int num=0;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                num+=1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
