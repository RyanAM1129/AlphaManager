package Model;

import java.util.ArrayList;

public class Client {
    private String myName;
    private Email myEmail;
    private PhoneNumber myPhoneNumber;
    private ArrayList<Pet> myPets;

    public Client(final String theName, final Email theEmail,
                  final PhoneNumber thePhoneNumber) {
        myName = theName;
        myEmail = theEmail;
        myPhoneNumber = thePhoneNumber;
        myPets = new ArrayList<Pet>();
    }

    public Client(final String theName, final Email theEmail,
                  final PhoneNumber thePhoneNumber, final Pet[] thePets) {
        myName = theName;
        myEmail = theEmail;
        myPhoneNumber = thePhoneNumber;
        myPets = new ArrayList<Pet>();
        setPets(thePets);
    }

    public String getName() {
        return myName;
    }

    public void setMyName(final String theName) {
        myName = theName;
    }

    public Email getEmail() {
        return myEmail;
    }

    public void setEmail(final Email theEmail) {
        myEmail = theEmail;
    }

    public PhoneNumber getPhoneNumber() {
        return myPhoneNumber;
    }

    public void setPhoneNumber(final PhoneNumber thePhoneNumber) {
        myPhoneNumber = thePhoneNumber;
    }

    public Pet[] getPets() {
        return (Pet[]) myPets.toArray();
    }

    public void setPets(final Pet[] thePets) {
        for (Pet pet : thePets) {
            myPets.add(pet);
        }
    }

    public void addPet(final Pet thePet) {

    }
}
