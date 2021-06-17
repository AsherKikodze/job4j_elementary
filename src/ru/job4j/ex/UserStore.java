package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User us:users) {
            if (us.getUsername().equals(login)) {
                return us;
            }
        }
        throw new UserNotFoundException("");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() >= 3 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pe", true)
                };
        User user;
        try {
            user = findUser(users, "Pe");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println("User not valid");
        } catch (UserNotFoundException uf) {
            System.out.println("User not found");
        }
    }
}
