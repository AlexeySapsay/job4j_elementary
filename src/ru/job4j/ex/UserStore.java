package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                return users[index];
            }
        }
        throw new UserNotFoundException();
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        } else {
            throw new UserInvalidException();
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            User[] users = {new User("Alex Sapsay1", true)};
            User user = findUser(users, "Alex Sapsay");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            System.out.println("User is not valid");
        } catch (UserNotFoundException unfe) {
            System.out.println("User not founded");
        }
    }
}
