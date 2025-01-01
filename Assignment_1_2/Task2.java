package Assignment_1_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int age = obj.nextInt();
        if (18 <= age && age <= 28) {
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}
