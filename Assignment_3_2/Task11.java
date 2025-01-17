package Assignment_3_2;

public class Task11 {
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

    }

    public class Cat implements Movable, Eat, Edible {

    }

    public class Mouse implements Movable, Edible {
        
    }
}
