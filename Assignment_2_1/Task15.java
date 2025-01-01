package Assignment_2_1;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        int[][] array2 = array;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = array2[j][i];
                System.out.print(array[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
