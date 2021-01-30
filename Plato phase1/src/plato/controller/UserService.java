package plato.controller;

import plato.model.users.User;
import plato.storage.Database;

import java.io.IOException;

public class UserService {
    Database database = new Database();

    public String register(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String name = user.getName();
        String family = user.getFamily();
        String email = user.getEmail();
        String phone_number = user.getPhone_number();
        Database database = new Database(username, password, name, family, email, phone_number, Database.PATH_USER);
        return "you are registered...";
    }

    public void login(User user) {
        database.setPassword(user.getPassword());
        database.setUsername(user.getUsername());
        database.select(Database.PATH_USER);
    }

    public void deleteAccount(User user) throws IOException {
        String username = user.getUsername();
        String password = user.getPassword();
        Database database = new Database(username, password);
        System.out.println(database.delete(Database.PATH_USER));
    }
}
