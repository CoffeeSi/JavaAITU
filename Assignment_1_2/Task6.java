package Assignment_1_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String str = obj.nextLine();
            try {
                if (str == "ENTER") {
                    break;
                } 
                else { 
                    sum = sum + Integer.parseInt(str); 
                }
            } catch (Exception e) {
                continue;
            }
            
        }
        System.out.println(sum);
    }
}
