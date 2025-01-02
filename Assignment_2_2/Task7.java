package Assignment_2_2;

public class Task7 {
    public static void main(String[] args) {
        signIn("user");
    }
    public static void signIn(String username){
        if (username == "user") {
            return;
        }
        else {
            System.out.println("Welcome " + username);
            System.out.println("Missed you very much, " + username);
        }
    }
}
