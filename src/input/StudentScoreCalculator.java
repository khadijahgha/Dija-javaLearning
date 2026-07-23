package input;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentScoreCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();// for storing scores
        ArrayList<String> contacts = new ArrayList<>();//for storing contacts

        // declaring variables
        double total = 0;

        for(int i=0; i<5; i++){
            System.out.println("Enter score: ");
            int numbers = input.nextInt();// a new variable declared for input
            scores.add(numbers);
        }
        for (int i=0; i<scores.size(); i++){
            System.out.println("Score values: " + scores.get(i));
            total += scores.get(i);
        }
        System.out.println("Total = " + total);

        double average = total / scores.size();
        System.out.println("Total Average " + average);

        input.nextLine();

        //Stores contacts and searching names
        for (int i=0;i<6; i++){
            System.out.println("Enter contacts: ");
            String name = input.nextLine();
            contacts.add(name);
        }
        for (int i=0;i<contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
        System.out.println("First Name: " + contacts.get(0));
        System.out.println("Last name: " + contacts.get(contacts.size()-1));
        System.out.println("Total contacts: " + contacts.size());

        //search
        System.out.println("Enter the contact name to search: ");
        String search =input.nextLine();

        if(contacts.contains(search)){
            System.out.println("Contact found!");
        }
        else{
            System.out.println("Contact not found!");
        }
    }
}
