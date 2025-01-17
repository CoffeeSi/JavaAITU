package Assignment_3_2;

public class Task3 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Human implements CanRun, CanSwim{
    }

    public class Duck implements CanFly, CanSwim, CanRun{
    }

    public class Penguin implements CanSwim, CanRun{
    }

    public class Airplane implements CanFly{
    }
}
