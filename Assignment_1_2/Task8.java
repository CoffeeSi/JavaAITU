package Assignment_1_2;

public class Task8 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
