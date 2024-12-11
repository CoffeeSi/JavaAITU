package Assignment_2;

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
                continue;
            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
