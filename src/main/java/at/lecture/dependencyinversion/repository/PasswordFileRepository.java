package at.lecture.dependencyinversion.repository;

public class PasswordFileRepository implements PasswordRepository {

    public void save(String service, String password) {
        System.out.println("Saved in file");
    }
}
