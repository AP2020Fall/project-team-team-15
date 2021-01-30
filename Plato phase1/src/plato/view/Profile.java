package plato.view;

import java.util.Scanner;

public class Profile {
    String name,family,email,phone_number;
    public void add_personal_information(){
        System.out.println("please enter your personal information");
        Scanner information=new Scanner(System.in);
        System.out.println("name:");
        name=information.next();
        System.out.println("family:");
        family=information.next();
        System.out.println("email:");
        email=information.next();
        System.out.println("phone_number:");
        phone_number=information.next();
    }
}
