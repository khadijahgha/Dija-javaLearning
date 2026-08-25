package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("*************************");
            System.out.println("Student Management System");
            System.out.println("*************************");
            System.out.println("1.Add student");
            System.out.println("2.Search student");
            System.out.println("3.Update student");
            System.out.println("4.Delete student");
            System.out.println("5.Display All student");
            System.out.println("6.Student statistics");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Exiting Student Management System....");
                    input.close();
                    return;

                case 1:
                    System.out.println("Enter student name = ");
                    String name = input.nextLine();

                    int age;
                    while(true) {
                        System.out.println("Enter student age = ");
                        if(input.hasNextInt()) {
                            age = input.nextInt();
                            input.nextLine();
                        if(age > 0){
                            break;
                        }else{
                            System.out.println("Invalid age! Age must be greater than 0.");
                        }
                        }else {
                            System.out.println("Invalid age! please try again...");
                            input.nextLine();
                        }
                    }

                    System.out.println("Enter student course = ");
                    String course = input.nextLine();

                    System.out.println("Enter student gpa = ");
                    double gpa = input.nextDouble();
                    input.nextLine();

                    System.out.println("Enter student country = ");
                    String country = input.nextLine();

                    Student student = new Student(
                            name,
                            age,
                            course,
                            gpa,
                            country
                    );
                    manager.addStudent(student);
                    break;

                case 2:
                    System.out.println("======= Search Student =======");
                    System.out.println("Enter student id:");
                    String id = input.nextLine();
                    manager.searchStudentById(id);
                    break;

                case 3:
                    System.out.println("===== Update Student =====");
                    System.out.println("Enter student id = ");
                    String updateId = input.nextLine();

                    System.out.println("1.Update Name");
                    System.out.println("2.Update Age");
                    System.out.println("3.Update Course");
                    System.out.println("4.Update GPA");
                    System.out.println("5.Update Country");
                    System.out.println("0.cancel");

                    System.out.println("Choose a choice:");
                    int updateChoice = input.nextInt();
                    input.nextLine();

                    switch (updateChoice){
                        case 0:
                            System.out.println("update cancelled...");
                            break;

                        case 1:
                            System.out.println("Enter new name = ");
                            String newName = input.nextLine();

                            manager.updateStudentName(updateId, newName);
                            break;

                        case 2:
                            System.out.println("Enter new age = ");
                            int newAge = input.nextInt();
                            input.nextLine();

                            manager.updateStudentAge(updateId, newAge);
                            break;

                        case 3:
                            System.out.println("Enter new Course = ");
                            String newCourse = input.nextLine();

                            manager.updateStudentCourse(updateId, newCourse);
                            break;

                        case 4:
                            System.out.println("Enter new Gpa = ");
                            double newGpa = input.nextDouble();
                            input.nextLine();

                            manager.updateStudentGpa(updateId, newGpa);
                            break;

                        case 5:
                            System.out.println("Enter new country = ");
                            String newCountry = input.nextLine();

                            manager.updateStudentCountry(updateId, newCountry);
                            break;

                        default:System.out.print("Invalid input! please try again...");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Enter student id = ");
                    String deleteId = input.nextLine();

                    manager.deleteStudentById(deleteId);
                    break;

                case 5:
                    manager.displayAllStudents();
                    break;

                case 6:
                    System.out.println("===== Student Statistic =====");

                    System.out.println("Total Students = " + manager.getStudentCount());
                    System.out.println("Average = " +  manager.getAverageGpa());
                    System.out.println("Excellent Student = " + manager.getExcellentStudentCount());
                    break;

                default:System.out.println("Invalid Input! please try again...");
                break;
            }
        }
    }
}