package Assignment_2_1;

import java.util.Scanner;

public class Task6 {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        array = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            array[i] = obj.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.print(max);
    }
}
