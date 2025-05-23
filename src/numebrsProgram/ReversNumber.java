package numebrsProgram;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print the number to revers");
        int num = scanner.nextInt();
        int output = 0;
        while (num > 0) {
            int temp = num % 10;
            output = output * 10 + temp;
            num = num / 10;

        }
        System.out.println(output);
    }
}
