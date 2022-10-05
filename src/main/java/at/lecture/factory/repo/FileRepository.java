package at.lecture.factory.repo;

public class FileRepository implements PasswordRepository {

    @Override
    public void save(String service, String password) {
        System.out.printf("Saving %s for %s in file system %n", password, service);
    }

    @Override
    public String read(String service) {
        return "test from file";
    }
}
