package Assignment_2_1;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        array = new char[n][2*n-1];
        int tt = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                array[i][j] = ' ';
            }
            tt += 2;
            for (int j = n-i-1; j < (n-i-1)+tt; j++) {
                array[i][j] = '#';
            }
            for (int j = 0; j < 2*n-1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
