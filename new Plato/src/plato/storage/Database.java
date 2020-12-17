package plato.storage;

//import plato.controller.AdminService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;

public class Database {
    public static String PATH="C:\\Users\\HO3EIN SHAH\\IdeaProjects\\plato\\data.txt";

    public Database() {
    }

    private String username="",password="";
    public Database(String username,String password){
        this.username=username;
        this.password=password;
        insert();
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

    public void write(){
        try {
            FileWriter fileWriter=new FileWriter(PATH);
            // fileWriter.write("username:\r\npassword:\r\n" );
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void insert(){
        try {
            FileWriter fileWriter=new FileWriter(PATH);
            fileWriter.write("username:"+getUsername().toString()+"\r\n"+"password:"+getPassword().toString()+"\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

