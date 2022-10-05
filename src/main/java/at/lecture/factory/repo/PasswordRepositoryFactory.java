package at.lecture.factory.repo;

import at.lecture.factory.Config;

import java.net.UnknownServiceException;

public class PasswordRepositoryFactory {

    public static PasswordRepository create() throws UnknownServiceException {
        switch (Config.PW_REPO) {
            case "DB": return new DbRepository();
            case "FILE": return new FileRepository();
        }

        throw new UnknownServiceException();
    }
}
