package numebrsProgram;

public class Fibinose {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        for (int i = 1; i <=n; i++) {
            int temp=a;
            a=b;
            b=b+temp;
            if (i==n){
                System.out.println(a);
            }
        }
    }
}
