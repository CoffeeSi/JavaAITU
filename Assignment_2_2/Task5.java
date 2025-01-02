package Assignment_2_2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
        }
        public static void reverseArray(int[] array) {
            int n = array.length;
            for (int i = 0; i < n/2; i++) {
                int temp = array[i];
                array[i] = array[n-i-1];
                array[n-i-1] = temp;
            }
        }
        public static void printArray(int[] array) {
        for (int i : array) {
        System.out.print(i + ", ");
        }
        System.out.println();
        }
}
