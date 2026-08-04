package oop;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student(
                "Swabirat Osman",
                37,
                "Computer Science",
                4.0,
                "Ghana"
        );

        Student student2 = new Student(
                "Alima Idris",
                20,
                "Mathematics",
                3.0,
                "Liberia"
        );

        Student student3 = new Student(
                "Sukainat Saeed",
                15,
                "Physics",
                3.9,
                "Canada"
        );

         /*student1.displayStudent();
         student2.displayStudent();
         student3.displayStudent();*/

        if(student2.isExcellentStudent()){
            System.out.println(student2.getName() + " is an excellent student.");
        }else{
            System.out.println(student2.getName() + " is not excellent student.");
        }

        System.out.println("Student number 1 details");
        System.out.println("-------------------------");
        System.out.println(student1.getName());
        student1.setGpa(3.5);
        System.out.println(student1.getGpa());
        System.out.println("**************************");

        System.out.println("Student number 2 details");
        System.out.println("-------------------------");
        System.out.println(student2.getName());
        student2.setGpa(4.5);
        System.out.println(student2.getGpa());
        System.out.println("**************************");

        System.out.println("Student number 3 details");
        System.out.println("-------------------------");
        System.out.println(student3.getName());
        student3.setGpa(2.0);
        System.out.println(student3.getGpa());
    }
}