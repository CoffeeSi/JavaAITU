package Assignment_3_2.Task6;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
    
    public class Screen implements Selectable, Updatable {
        public void onSelect() {
            System.out.println("Screen selected");
        }
        public void refresh() {
            System.out.println("Screen refreshed");
        }
    }
}
