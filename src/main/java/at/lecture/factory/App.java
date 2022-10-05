package at.lecture.factory;

import at.lecture.factory.repo.PasswordRepository;
import at.lecture.factory.repo.PasswordRepositoryFactory;

import java.net.UnknownServiceException;

public class App {

    public void run() {
        try {
            PasswordRepository passwordRepository = PasswordRepositoryFactory.create();

            passwordRepository.save("insta", "12345");
        } catch (UnknownServiceException e) {
            throw new RuntimeException(e);
        }


    }
}
