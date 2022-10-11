package at.lecture.clientserver;

public class Main {

    public static void main(String[] args) {
        PasswordCheck passwordCheck = new PasswordCheck();

        if (!passwordCheck.hasBeenPawned("password1")) {
            System.out.println("Password saved!");
        } else {
            System.out.println("Password is not safe anymore...");
        }
    }
}
