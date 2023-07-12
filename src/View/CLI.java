package View;

import Controller.Validator;

public class CLI {

    public static void intro() {
        System.out.println("Welcome to Alpha Manager.");
        System.out.println("The answer to all your pet grooming needs.");
    }

    public static void mainMenu() {
        System.out.println("Please make a selection: ");
        System.out.println("1. Add Client\n2. Add Pet\n3. Make Appointment\n4. Exit");
    }

    public static void addClient() {
        System.out.println("Please enter the clients name: ");
        System.out.print(">");
        String name = Validator.getName();
        System.out.println(name);
    }
}
