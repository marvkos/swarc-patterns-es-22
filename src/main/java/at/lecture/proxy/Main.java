package at.lecture.proxy;

public class Main {

    public static void main(String[] args) {
        PasswordCheck passwordCheck = new PasswordCheckCache();

        System.out.println("1st Attempt ---------------------------");

        if (!passwordCheck.hasBeenPawned("password")) {
            System.out.println("Password saved!");
        } else {
            System.out.println("Password is not safe anymore...");
        }

        System.out.println("2nd Attempt ---------------------------");

        if (!passwordCheck.hasBeenPawned("password")) {
            System.out.println("Password saved!");
        } else {
            System.out.println("Password is not safe anymore...");
        }
    }
}
