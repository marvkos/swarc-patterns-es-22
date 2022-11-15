package at.lecture.decorator;

import at.lecture.decorator.decorator.LengthCheck;

public class App {

    public void run() {
        PasswordSaver passwordSaver = new PasswordFileSaver();
        passwordSaver = new LengthCheck(passwordSaver);

        passwordSaver.save("test");
    }
}
