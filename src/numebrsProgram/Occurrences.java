package numebrsProgram;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Print the numbers ");
        int num = scanner.nextInt();
        System.out.println("Print the single numbers to find the Occurrences");
        int target =scanner.nextInt();
        int count = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp == target) {
                count++;
            }
            num = num / 10;

        }
        System.out.println("No of times given number is printed is "+count);


    }
}
