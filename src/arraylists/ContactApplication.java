package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();

        for(int i=0; i<6;i++){
            System.out.println("Enter a contact name:");
            String name =input.nextLine();
            contacts.add(name);
        }

        System.out.println("---contacts---");
        for(int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
        System.out.println("Enter the contact name to search: ");
        String search = input.nextLine();

        if(contacts.contains(search)){
            System.out.println("Contact found!");
        }
        else{
            System.out.println("Contact not found!");
        }

    }
}
