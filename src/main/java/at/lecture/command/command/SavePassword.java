package at.lecture.command.command;

import at.lecture.command.PasswordManagerLogic;

public class SavePassword implements Command {

    private final PasswordManagerLogic app;


    public SavePassword(PasswordManagerLogic app) {
        this.app = app;
    }

    @Override
    public void execute() {
        this.app.savePassword();
    }

    @Override
    public String toString() {
        return "Save password";
    }
}
