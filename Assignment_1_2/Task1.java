package Assignment_1_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int temp = obj.nextInt();
        if (temp < 0) {
            System.out.println("it's cold outside,");
        }
        else {
            System.out.println("it's warm outside.");
        }
    }
}
