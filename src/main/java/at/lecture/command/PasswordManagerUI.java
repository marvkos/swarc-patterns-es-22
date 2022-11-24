package at.lecture.command;

import at.lecture.command.command.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordManagerUI {

    private final List<Command> commands;

    private final PasswordManagerLogic passwordManagerLogic;

    public PasswordManagerUI() {
        this.passwordManagerLogic = new PasswordManagerLogic();

        this.commands = new ArrayList<>();
        this.commands.add(new ListPasswords(this.passwordManagerLogic));
        this.commands.add(new SavePassword(this.passwordManagerLogic));
        this.commands.add(new DeletePassword(this.passwordManagerLogic));
        this.commands.add(new Exit(this.passwordManagerLogic));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Commands:");
            int index = 0;
            for (Command command: this.commands) {
                System.out.printf("[%s] %s%n", index++, command.toString());
            }
            System.out.println();
            System.out.print("Commands: ");
            int command = scanner.nextInt();

            this.commands.get(command).execute();
            System.out.println();
        }
    }
}
