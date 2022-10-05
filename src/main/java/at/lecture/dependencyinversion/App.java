package at.lecture.dependencyinversion;

import at.lecture.dependencyinversion.repository.PasswordDatabaseRepository;
import at.lecture.dependencyinversion.service.PasswordEngine;

public class App {

    public void start() {
        PasswordEngine passwordEngine = new PasswordEngine(new PasswordDatabaseRepository());

        passwordEngine.save("Insta", "12345");
    }
}
