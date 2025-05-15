package pattren;

public class XBordr {
    public static void main(String[] args) {
        int n=15;
        for (int i = 0; i <n/2 ; i++) {
            for (int j = 0; j <n; j++) {
                if(i>=j||i+j>=n-1)
                {
                    System.out.print('*');
                }else System.out.print(' ');

            }
            System.out.println();
        }
        for (int i = n/2-1; i >=0 ; i--) {

            for (int j = 0; j <n ; j++) {
                if (i>=j||i+j>=n-1){
                    System.out.print('*');
                }else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
