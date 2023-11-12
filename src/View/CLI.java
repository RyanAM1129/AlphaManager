package View;

import Controller.Validator;
import Model.*;

public class CLI {

    public static void intro() {
        System.out.println("Welcome to Alpha Manager.");
        System.out.println("The answer to all your pet grooming needs.");
    }

    public static void mainMenu() {
        System.out.println("Main Menu: ");
        System.out.println("1. Add Client\n2. Show Client Book\n3. Add Pet\n4. Make Appointment\n5. Exit");
        System.out.println("Please enter a number between " + 1 + " and " + 5 + ":");
    }

    public static void addClient() {
        System.out.println("Please enter the clients name: ");
        System.out.print(">");
        String theName = Validator.getClientName();
        System.out.println("Please enter the clients eMail: ");
        System.out.print(">");
        Email theEmail = Validator.getEmail();
        System.out.println("Please enter the clients phone number: ");
        System.out.print(">");
        PhoneNumber thePhoneNumber = Validator.getPhoneNumber();
        Client theClient = new Client(theName, theEmail, thePhoneNumber);
        ClientBook.addClient(theClient);
    }

    public static void printAllClients() {
        for(Client client : ClientBook.getClientBook()) {
            System.out.println("Name: " + client.getName());
            System.out.println("eMail: " + client.getEmail());
            System.out.println("Phone Number: " + client.getPhoneNumber());
            System.out.println("Pets: ");
            if(client.hasPets()) {
                for (Pet pet : client.getPets()) {
                    System.out.println("\t" + pet.getName());
                }
            } else {
                System.out.println("\tempty");
            }
        }
    }

    public static void addPet() {
        System.out.println("Please enter the pet's name:");
        System.out.print(">");
        String theName = Validator.getPetName();

    }
}
