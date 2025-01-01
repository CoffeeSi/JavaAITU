package Assignment_1_2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
