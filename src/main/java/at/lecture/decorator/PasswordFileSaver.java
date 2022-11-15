package at.lecture.decorator;

public class PasswordFileSaver implements PasswordSaver {

    @Override
    public void save(String password) {
        System.out.println("Password saved in file!");
    }
}
