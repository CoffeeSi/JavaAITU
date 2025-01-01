package Assignment_1_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end = obj.nextInt();
        int multiple = obj.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
            else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
