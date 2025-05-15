package pattren;

public class LeftTriangle {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=m ; j++) {
                if(i<j){
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

}
