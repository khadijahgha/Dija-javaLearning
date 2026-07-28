package oop;

public class Student {
    String name;
    int age;
    String course;
    double gpa;
    String country;

    //constructors

    Student(String name, int age, String course,double gpa, String country){
        this.name = name;
        this.age =age;
        this.course = course;
        this.gpa = gpa;
        this.country = country;
    }

    //method
    public void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
        System.out.println("Country: " + country);
    }
}