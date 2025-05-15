package arrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("print numbers of rows you need");
        int rows=scanner.nextInt();
        System.out.println("print numbers of columns you need");
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("enter the number for "+ (i+1) +" row and "+ (j+1) +" columns");
                array[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Thank you for entering the numbers");
        System.out.println("Now printing all the numbers");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]);
                System.out.print(' ');

            }
            System.out.println();
        }
    }
}
