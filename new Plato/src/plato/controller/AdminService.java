package plato.controller;
import plato.model.users.Admin;
import plato.storage.Database;
import java.util.Scanner;

public class AdminService {
    public String Register(Admin admin) {
        String username= admin.getUsername();
        String password=admin.getPassword();
        Database database=new Database(username,password);
        database.insert();
        return "you are registered...";
    }
    public void login(){

    }
    public void logout(){

    }
    public void modifyProfile(){

    }
}

