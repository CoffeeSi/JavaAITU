package Assignment_2_1;

import java.util.Scanner;

public class Task7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = obj.nextLine();
            for (int j = 0; j < i; j++) {
                if (strings[i].equals(strings[j])) {
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
