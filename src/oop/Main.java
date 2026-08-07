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

        StudentManager manager = new StudentManager();
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        manager.displayAllStudents();

        System.out.println();
        manager.searchStudent("Swabirat Osman");
        System.out.println();
        manager.searchStudent("David");


    }
}