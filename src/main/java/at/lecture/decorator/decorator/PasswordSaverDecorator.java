package at.lecture.decorator.decorator;

import at.lecture.decorator.PasswordSaver;

public abstract class PasswordSaverDecorator implements PasswordSaver {

    protected PasswordSaver wrappee;

    public PasswordSaverDecorator(PasswordSaver wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void save(String password) {
        this.wrappee.save(password);
    }
}
