package Assignment_1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double temp = obj.nextDouble();
        boolean isHigh = temp >= 36.6;
        boolean isLow = temp <= 36.6;
        if (isHigh && isLow) {
            System.out.println("normal");
        }
        else if (isHigh) {
            System.out.println("high");
        }
        else {
            System.out.println("low");
        }
    }
}
