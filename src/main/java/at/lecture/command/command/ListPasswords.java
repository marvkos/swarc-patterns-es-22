package at.lecture.command.command;

import at.lecture.command.PasswordManagerLogic;

public class ListPasswords implements Command {

    private final PasswordManagerLogic app;

    public ListPasswords(PasswordManagerLogic app) {
        this.app = app;
    }

    @Override
    public void execute() {
        this.app.listPasswords();
    }

    @Override
    public String toString() {
        return "List passwords";
    }
}
