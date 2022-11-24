package at.lecture.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManagerLogic {

    private final Map<String, String> passwords;

    public PasswordManagerLogic() {
        this.passwords = new HashMap<>();
    }

    public void listPasswords() {
        System.out.println("- List Passwords -");
        System.out.println("Passwords:");
        for (Map.Entry<String, String> entry: passwords.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }

    public void savePassword() {
        System.out.println("- Save Password -");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Service: ");
        String service = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        passwords.put(service, password);
    }

    public void deletePassword() {
        System.out.println("- Save Password -");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Service: ");
        String service = scanner.next();

        passwords.remove(service);
    }

    public void exit() {
        System.exit(0);
    }
}
