package Assignment_3_2.Task16;

import Assignment_3_2.Color;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
        Integer getAge();
    }

    public static class Fox implements Animal{
        public String getName() {
            return "Fox.";
        }

        @Override
        public Color getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return null;
        }
    }
}
