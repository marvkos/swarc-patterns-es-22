package at.lecture.proxy;

import java.util.HashMap;
import java.util.Map;

public class PasswordCheckCache implements PasswordCheck {

    private final PasswordCheckRequest passwordCheckRequest;

    private final Map<String, Boolean> checkedPasswords;

    public PasswordCheckCache() {
        this.passwordCheckRequest = new PasswordCheckRequest();
        this.checkedPasswords = new HashMap<>();
    }

    @Override
    public boolean hasBeenPawned(String password) {
        if (checkedPasswords.containsKey(password)) {
            return checkedPasswords.get(password);
        }

        boolean hasBeenPawned = this.passwordCheckRequest.hasBeenPawned(password);
        this.checkedPasswords.put(password, hasBeenPawned);

        return hasBeenPawned;
    }
}
