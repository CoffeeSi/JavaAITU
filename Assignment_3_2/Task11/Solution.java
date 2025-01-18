package Assignment_3_2.Task11;

public class Solution {
    public static void main(String[] args) {
    }

    // can move
    public interface Movable {
        void move();
    }

    // can be eaten
    public interface Edible {
        void beEaten();
    }

    // might eat someone
    public interface Eat {
        void eat();
    }

    public class Dog implements Movable, Eat {
        public void move() {}
        public void eat() {}
    }

    public class Cat implements Movable, Eat, Edible {
        public void move() {}
        public void eat() {}
        public void beEaten() {}

    }

    public class Mouse implements Movable, Edible {
        public void move() {}
        public void beEaten() {}
    }
}
