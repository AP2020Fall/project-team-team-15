package plato.controller;

import plato.model.users.Admin;
import plato.model.users.User;
import plato.storage.Database;

import java.io.IOException;
import java.util.Scanner;

public class AdminService {
    public String Register(Admin admin) {
        String username= admin.getUsername();
        String password=admin.getPassword();
        String name=admin.getName();
        String family=admin.getFamily();
        String email=admin.getEmail();
        String phone_number=admin.getPhone_number();
        Database database=new Database(username,password,name,family,email,phone_number,Database.PATH_ADMIN);
        return "you are registered...";
    }
    public void login(Admin admin){
        String username=admin.getUsername();
        String password=admin.getPassword();
        Database database=new Database(username,password);
        System.out.println(database.select(Database.PATH_ADMIN));
    }
    public void deleteAccount(Admin admin) throws IOException {
        String username= admin.getUsername();
        String password=admin.getPassword();
        Database database=new Database(username,password);
        System.out.println(database.delete(Database.PATH_ADMIN));
    }
}
