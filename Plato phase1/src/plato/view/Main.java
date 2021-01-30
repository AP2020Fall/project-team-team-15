package plato.view;

import plato.controller.AdminService;
import plato.controller.UserService;
import plato.model.users.Admin;
import plato.model.users.User;
import plato.storage.Database;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Profile profile=new Profile();
        Scanner adminRegister = new Scanner(System.in);
        System.out.println("welcome to plato");
        Main main = new Main();
        File file = new File(Database.PATH_ADMIN);
        if (file.exists()) {

            main.role();
        }
        else {
            System.out.println("please register as admin");
            System.out.println("username:");
            String username = adminRegister.nextLine();
            System.out.println("password");
            String password = adminRegister.nextLine();
            profile.add_personal_information();
            Admin admin = new Admin(username, password,profile.name,profile.family,profile.email,profile.phone_number);
            AdminService adminService = new AdminService();
            System.out.println(adminService.Register(admin));
        }
    }

    public Boolean role() throws IOException {
        Profile profile=new Profile();
        Scanner input = new Scanner(System.in);
        UserService userService = new UserService();
        AdminService adminService = new AdminService();
        System.out.println("enter your role as 1 or 2");
        System.out.println("1.username");
        System.out.println("2.admin");
        String role = input.nextLine();
        if (role.equals("1")) {
            System.out.println("1.login");
            System.out.println("2.register");
            System.out.println("3.delete");
            String enter = input.nextLine();
            if (enter.equals("1")) {
                System.out.println("login as user");
                System.out.println("username:");
                String username = input.nextLine();
                System.out.println("password");
                String password = input.nextLine();
                User user = new User(username, password);
                userService.login(user);
            } else if (enter.equals("2")) {
                System.out.println("register as username");
                System.out.println("username:");
                String username = input.nextLine();
                System.out.println("password");
                String password = input.nextLine();
                profile.add_personal_information();
                User user = new User(username, password,profile.name,profile.family,profile.email,profile.phone_number);
                userService.register(user);
            }
            else if (enter.equals("3")){
                System.out.println("username:");
                String username = input.nextLine();
                System.out.println("password");
                String password = input.nextLine();
                User user = new User(username, password);
                userService.deleteAccount(user);
            }
            return true;
        } else if (role.equals("2")) {
            System.out.println("1.login");
            System.out.println("2.register");
            System.out.println("3.delete");
            String enter = input.nextLine();
            if (enter.equals("1")) {
                System.out.println("login as admin");
                String username = input.nextLine();
                String password = input.nextLine();
                Admin admin = new Admin(username, password);
                adminService.login(admin);
            } else if (enter.equals("2")) {
                System.out.println("register as admin");
                String username = input.nextLine();
                String password = input.nextLine();
                profile.add_personal_information();
                Admin admin = new Admin(username, password,profile.name,profile.family,profile.email,profile.phone_number);
                adminService.Register(admin);
            }
            else if (enter.equals("3")){
                System.out.println("username:");
                String username = input.nextLine();
                System.out.println("password");
                String password = input.nextLine();
                Admin admin = new Admin(username, password);
                adminService.deleteAccount(admin);
            }

            return true;
        }
        else {
            System.out.println("please enter correct number");
            return false;
        }
    }

}

