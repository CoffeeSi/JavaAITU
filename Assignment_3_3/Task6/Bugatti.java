package Assignment_3_3.Task6;

public class Bugatti {
    private String color;
    private int year;
    private String body;

    public Bugatti(String color, int year, String body) {
        this.color = color;
        this.year = year;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}