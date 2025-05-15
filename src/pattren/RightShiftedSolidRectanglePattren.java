package pattren;

public class RightShiftedSolidRectanglePattren {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n / 2 && i + j < n) {
                    System.out.print('*');
                } else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
