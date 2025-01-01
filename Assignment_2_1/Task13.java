package Assignment_2_1;

import java.util.Scanner;

public class Task13 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int max = -2147483647;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = obj.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
