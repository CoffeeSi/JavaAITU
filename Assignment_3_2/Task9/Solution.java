package Assignment_3_2.Task9;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        double speed();
    }

    public interface CanFly extends CanMove{
        double speed(CanFly param);
    }
}
