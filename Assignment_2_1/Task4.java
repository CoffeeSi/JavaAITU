package Assignment_2_1;

public class Task4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            count++;
        }
        for (int j = 0; j < secondArray.length; j++) {
            resultArray[count+j] = secondArray[j];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
