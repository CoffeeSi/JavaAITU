package Assignment_1_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        if (!(20 <= age && age <= 60)) {
            System.out.println("you don't have to work.");
        }
    }
}
