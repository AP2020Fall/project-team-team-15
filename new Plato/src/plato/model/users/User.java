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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDate_of_register() {
        return date_of_register;
    }

    public void setDate_of_register(int date_of_register) {
        this.date_of_register = date_of_register;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Log_Of_Games getLog() {
        return log;
    }

    public void setLog(Log_Of_Games log) {
        this.log = log;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public List getFriend_request() {
        return friend_request;
    }

    public void setFriend_request(List friend_request) {
        this.friend_request = friend_request;
    }
}
