import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        for (int i=0; i<5;i++){
            System.out.println("Enter student name:");
            String name = input.nextLine();
            students.add(name);
        }

        //search string
        System.out.println("Enter the name of student you want to search: ");
        String search = input.nextLine();

        if(students.contains(search)){
         System.out.println("Student successfully found!");
        }
        else{
            System.out.println("Student cannot be found");
        }

        //update and delete
        int choice = -1;
        while(true){
            System.out.println("Choose Option");
            System.out.println("1.Update student:");
            System.out.println("2.Delete student:");
            System.out.println("3.Display all students:");
            System.out.println("0.Exit");

            try{
                choice = input.nextInt(); // reads user input
                input.nextLine();

                switch(choice){
                    case 1:
                        System.out.println("Enter current name:");
                        String currentName = input.nextLine();

                        if(students.contains(currentName)){
                            System.out.println("Enter the new students name:");
                            String newName = input.nextLine();
                            int index = students.indexOf(currentName);
                            students.set(index, newName);
                        }
                        System.out.println("Updated list");
                        System.out.println("------------");
                        for(String student : students){
                            System.out.println(student);
                        }
                        break;

                    case 2:
                        System.out.println("Enter the name you want to delete:");
                        String studentName = input.nextLine();

                        if(students.contains(studentName)){
                            students.remove(studentName);
                        }
                        break;

                    case 3:
                        System.out.println("Students List");
                        System.out.println("-------------");
                        for(int i =0; i<students.size(); i++){
                            System.out.println(students.get(i));
                        }
                        break;

                    case 0:
                        System.out.println("Goodbye");
                        input.close();
                        return;

                    default:
                        System.out.println("Invalid input!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Input.Please try again!");
                input.nextLine();
            }
        }
    }
}