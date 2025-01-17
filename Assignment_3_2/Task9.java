package Assignment_3_2;

public class Task9 {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        double speed();
    }

    public interface CanFly extends CanMove{
        double speed(CanFly param);
    }
}
