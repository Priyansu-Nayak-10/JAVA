public class P10_ContinuousTri {
    public static void main(String[] args){
        int row=4;
        int num=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                num+=1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
