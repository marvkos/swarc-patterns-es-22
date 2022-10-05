package at.lecture.dependencyinversion.service;

import at.lecture.dependencyinversion.repository.PasswordRepository;

public class PasswordEngine {

    private PasswordRepository repository;

    public PasswordEngine(PasswordRepository repository) {
        this.repository = repository;
    }

    public void save(String service, String password) {
        password = "****" + password + "****";

        repository.save(service, password);
    }
}
