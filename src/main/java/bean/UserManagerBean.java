package bean;

import model.User;

import java.util.HashSet;
import java.util.Set;

public class UserManagerBean {
    private Set<User> users = new HashSet<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void registerUsers(User... users){
        for (User user : users) {
            registerUser(user);
        }
    }

    public void printRegisteredUsers() {
        System.out.println("---------------------");
        System.out.println("Registered users are: ");
        users.forEach(System.out::println);
        System.out.println("---------------------");
    }

}
