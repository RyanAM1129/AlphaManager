package View;

import Controller.Validator;

public class Main {

    public static void main(String[] args) {
        runCLI();
    }

    public static void runCLI() {
        CLI.intro();
        CLI.mainMenu();
        int choice;
        do {
            choice = Validator.getInt(1, 4);
            //Need to check input
            switch (choice) {
                case 1:
                    //Run add Client
                case 2:
                    //Run add Pet
                case 3:
                    //Run schedule appointment
                case 4:
                    System.out.println("Closing...");
            }
        }while(choice != 4);
    }
}
