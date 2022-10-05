package at.lecture.dependencyinversion.repository;

public interface PasswordRepository {

    void save(String service, String password);
}
