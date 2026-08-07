package oop;

//Responsible for Name, Age,Course,GPA,Country,checking if student is excellent and Displaying one student's details

public class Student {
    private String name;
    private int age;
    private String course;
    private double gpa;
    private String country;

    //constructors
    Student(String name, int age, String course,double gpa, String country){
        this.name = name;
        this.age = age;
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

    //method
    public boolean isExcellentStudent(){
     return gpa >= 3.5;
    }

    //Getters
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }

    //Setters
    public void setGpa(double gpa){
        if(gpa >= 2.5 && gpa <= 4.5){
            this.gpa = gpa;
        }else{
            System.out.println("Invalid gpa! gpa must be between 2.5 and 4.5");
        }
    }
    public void setName(String name){
        this.name = name;
    }
}



