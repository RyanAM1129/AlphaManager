package Model;

import java.util.ArrayList;

public class ClientBook {
    private static ArrayList<Client> myClientBook = new ArrayList<>();

    public static void addClient(final Client theClient) {
        myClientBook.add(theClient);
    }

    public static Client getClient(final String theEmail) {
        for(Client client : myClientBook) {
            if(client.getEmail().toString().equals(theEmail)) {
                return client;
            }
        }
        return null;
    }

    public static ArrayList<Client> getClientBook() {
        return myClientBook;
    }
}
