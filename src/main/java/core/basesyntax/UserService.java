package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) throws UserNotFoundException {

        for (int i = 0; i < records.length; i++) {
            if (email.equals(records[i].substring(0,records[i].indexOf(':')))) {

                return Integer.parseInt(records[i].substring(records[i].indexOf(":") + 1));
            }
        }

        throw new UserNotFoundException("User with given email doesn't exist");

    }
}
