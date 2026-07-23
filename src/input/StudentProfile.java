package input;

import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age =input.nextInt();

        input.nextLine();// very important

        System.out.println("Enter your course: ");
        String course = input.nextLine();


        System.out.println("\nStudentInformation");
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
