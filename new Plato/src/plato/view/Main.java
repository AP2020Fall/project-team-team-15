package plato.view;


import plato.controller.AdminService;
import plato.model.users.Admin;
import plato.storage.Database;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import plato.storage.Database;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Database database=new Database();

        System.out.println("welcome to plato");
        File file= new File(database.PATH);
        if (file.exists()){
        }
        else {
            System.out.println("please register");
            String username= input.nextLine();
            String password=input.nextLine();
            Admin admin=new Admin(username,password);
            AdminService adminService=new AdminService();
            System.out.println(adminService.Register(admin));
        }
        //   Scanner instruction=new Scanner(System.in);

        //  String ins=instruction.next();
        /*switch (ins){
            case*/
        //    }
    }
}
