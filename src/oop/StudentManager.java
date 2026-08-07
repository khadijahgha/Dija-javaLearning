package oop;

//responsible for adding,updating, removing,searching,displaying
// all student,counting students and calculating average

import java.util.ArrayList;

public class StudentManager {
  private ArrayList<Student> students = new ArrayList<>();

  //method
  public void addStudent(Student student){
    students.add(student);
  }

  public void displayAllStudents(){
    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      System.out.println("Student " + (i + 1));
      System.out.println("-------------");
      student.displayStudent();
      System.out.println();
    }
  }

  public void searchStudent(String name){
    boolean found = false;

    System.out.println("Search");
    System.out.println("-------");

    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);

      if(student.getName().equals(name)){
        student.displayStudent();
        System.out.println("Student found!");
        found = true;
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

}
