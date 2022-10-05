package at.lecture.factory.repo;

public interface PasswordRepository {

    void save(String service, String password);

    String read(String service);
}
