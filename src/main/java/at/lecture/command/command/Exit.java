package at.lecture.command.command;

import at.lecture.command.PasswordManagerLogic;

public class Exit implements Command {

    private final PasswordManagerLogic app;

    public Exit(PasswordManagerLogic app) {
        this.app = app;
    }

    @Override
    public void execute() {
        this.app.exit();
    }

    @Override
    public String toString() {
        return "Exit";
    }
}
