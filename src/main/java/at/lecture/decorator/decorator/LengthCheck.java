package at.lecture.decorator.decorator;

import at.lecture.decorator.PasswordSaver;

public class LengthCheck extends PasswordSaverDecorator {

    public LengthCheck(PasswordSaver passwordSaver) {
        super(passwordSaver);
    }

    @Override
    public void save(String password) {

        if (password.length() < 5) {
            System.out.println("Password is too short!");
            return;
        }

        super.save(password);
    }
}
