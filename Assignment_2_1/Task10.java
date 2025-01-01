package Assignment_2_1;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            multiArray[i] = new int[obj.nextInt()];
        }
    }
}
