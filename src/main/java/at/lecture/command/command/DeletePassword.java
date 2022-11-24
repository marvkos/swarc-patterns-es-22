package at.lecture.command.command;

import at.lecture.command.PasswordManagerLogic;

public class DeletePassword implements Command {

    private final PasswordManagerLogic app;

    public DeletePassword(PasswordManagerLogic app) {
        this.app = app;
    }

    @Override
    public void execute() {
        this.app.deletePassword();
    }

    @Override
    public String toString() {
        return "Delete password";
    }
}
