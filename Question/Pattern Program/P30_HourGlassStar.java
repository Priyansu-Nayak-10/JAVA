public class P30_HourGlassStar {
    public static void main(String args[]) {
        int row = 6;

        for (int i = row; i >= 1; i--) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
