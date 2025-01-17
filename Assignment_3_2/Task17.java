package Assignment_3_2;

public class Task17 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
    }

    public static class BigFox extends Fox{
        @Override
        public Color getColor() {
            Color color = new Color(0, 0, 255);
            return color.printColor();
        }
    }
}
