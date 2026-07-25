package oop;

public class Main{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Swabirat";
        student1.age = 22;
        student1.course = "Computer science";
        student1.gpa = 4.0;

        student2.name = "Saeed";
        student2.age = 22;
        student2.course = "Arabic";
        student2.gpa = 3.5;

        System.out.println("Student 1");
        System.out.println("----------");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Course: " + student1.course);
        System.out.println("GPA: " + student1.gpa);

        System.out.println("----------");

        System.out.println("Student 2");
        System.out.println("----------");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Course: " + student2.course);
        System.out.println("GPA: " + student2.gpa);
    }
}