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

         student1.displayStudent();
         student2.displayStudent();
         student3.displayStudent();
    }
}