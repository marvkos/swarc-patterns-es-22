package at.lecture.dependencyinversion.repository;

public class PasswordDatabaseRepository implements PasswordRepository {

    public void save(String service, String password) {
        System.out.println("Saved in Database");
    }
}
