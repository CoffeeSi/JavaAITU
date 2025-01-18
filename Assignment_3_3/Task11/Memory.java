package Assignment_3_3.Task11;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = { "object15", null, null, "object2", null, null, null, null,
                "object32", null, "object4" };
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.err.println(array[i]);

                for (int j = i; j > 0; j--) {
                    if (array[j-1] != null) {
                        break;
                    }
                    String temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
