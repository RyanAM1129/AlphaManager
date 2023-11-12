package View;

import Controller.Validator;

public class Main {

    public static void main(String[] args) {
        runCLI();
    }

    public static void runCLI() {
        CLI.intro();
        int choice;
        do {
            CLI.mainMenu();
            choice = Validator.getInt(1, 5);
            //Need to check input
            switch (choice) {
                case 1:
                    CLI.addClient();
                    break;
                case 2:
                    CLI.printAllClients();
                    break;
                case 3:
                    CLI.addPet();
                    break;
                case 4:
                    //Run schedule appointment
                    break;
                case 5:
                    System.out.println("Closing...");
                    Validator.closeScanner();
            }
        }while(choice != 5);
    }
}
