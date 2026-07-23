package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDrivenStudentManagement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        for(int i = 0; i < 3; i++){

            System.out.println("Enter Student name: "); // user input
            String name = input.nextLine();
            students.add(name);// add students name
        }

        System.out.println("Students: ");
        System.out.println("----------");

        for (int i =0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.println("First Name: " + students.get(0));
        System.out.println("Last Name: " + students.get(students.size()-1));
    }
}
