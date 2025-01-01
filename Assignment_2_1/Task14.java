package Assignment_2_1;

import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int min = 2147483647;
        int sumRow = 0;
        int sumColumn = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumColumn += array[i][j];
                sumRow += array[j][i];
            }
            if (sumRow < min) min = sumRow;
            if (sumColumn < min) min = sumColumn;
            sumRow = 0;
            sumColumn = 0;
        }
        System.out.println(min);
    }
}
