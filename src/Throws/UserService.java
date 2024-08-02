package Throws;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<String> listOfUserName;

    public UserService() {
        this.listOfUserName = new ArrayList<>();
    }

    public void registerUser(String username) throws UserAlreadyExistsException {
        if (this.listOfUserName.contains(username))
            throw new UserAlreadyExistsException("user already exists in the system");
        System.out.println("Added User:\t" + username);
        this.listOfUserName.add(username);
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!this.listOfUserName.contains(username))
            throw new UserNotFoundException("No Such User Exist");
    }
}
