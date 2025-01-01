package Assignment_2_1;

import java.io.Console;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] Narray = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                Narray[i] = obj.nextInt();
            }
        }
        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.println(Narray[N-i-1]);
            }
        }
        else if (N % 2 == 1) {
            for (int i = 0; i < N; i++) {
                System.out.println(Narray[i]);
            }
        }
        
    }
}
