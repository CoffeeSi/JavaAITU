package Assignment_2_1;

public class Task9 {
    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < 10; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
}
