package Assignment_3_2;

public class Task2 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat{
    }

    public class Duck implements CanFly, CanMove, CanEat {
    }

    public class Car implements CanMove{
    }

    public class Airplane implements CanMove, CanFly{
    }
}
