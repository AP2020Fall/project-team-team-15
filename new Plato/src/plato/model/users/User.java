package plato.model.users;
import java.awt.*;
import java.util.ArrayList;

public class User {
    String name,family,username,password,email,phone_number;
    int userId,date_of_register,money,score;
    Log_Of_Games log;
    ArrayList<User> friends;
    List friend_request;

    public User(String name, String family, String username, String password, String email, String phone_number, int userId, int date_of_register, int money, int score, Log_Of_Games log, ArrayList<User> friends, List friend_request) {
        this.name = name;
        this.family = family;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.userId = userId;
        this.date_of_register = date_of_register;
        this.money = money;
        this.score = score;
        this.log = log;
        this.friends = friends;
        this.friend_request = friend_request;
    }

}
