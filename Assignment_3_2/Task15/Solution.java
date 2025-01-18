package Assignment_3_2.Task15;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

        @Override
        public void onSelect() {
        }

        @Override
        public void refresh() {
        }
    }
}
