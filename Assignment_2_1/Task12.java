package Assignment_2_1;

public class Task12 {
    public static int[][] array;

    public static void main(String[] args) {
        array = new int[2][];
        array[0] = new int[]{2, 3, 8};
        array[1] = new int[]{6, 4, 9};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
