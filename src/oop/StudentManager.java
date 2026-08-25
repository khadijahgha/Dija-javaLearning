package oop;
//responsible for adding,updating, removing,searching,displaying all student,counting students and calculating average

import java.util.ArrayList;

public class StudentManager {
  private ArrayList<Student> students = new ArrayList<>();
  private int nextId = 1;

  //method
  public void addStudent(Student student){
    String id = String.format("STU%03d", nextId);
    student.setId(id);
    students.add(student);
    System.out.println("Student id: " + id);
    nextId++;
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
  public void searchStudentById(String id){
    boolean found = false;

    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);

      if(student.getId().equals(id)){
        student.displayStudent();
        found = true;
        System.out.println("Student found!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void updateStudentCourse(String id, String newCourse){
    boolean found = false;

    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.getId().equals(id)){
        found = true;
         //update here
        student.setCourse(newCourse);
        System.out.println("Student course updated successfully!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void deleteStudent(String name){
    boolean found = false;

    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.getName().equals(name)){
        students.remove(student);
        found = true;
        System.out.println("Student removed successful!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void deleteStudentById(String id){
    boolean found = false;
    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.getId().equals(id)){
        found = true;
        students.remove(student);
        System.out.println("Student removed!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void updateStudentName(String id, String newName){
    boolean found = false;
    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);

      if(student.getId().equals(id)){
        found = true;
        student.setName(newName);
        System.out.println("Student name updated successfully!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void updateStudentAge(String id, int newAge){
    boolean found = false;
    for(int i = 0; i < students.size(); i++){
    Student student = students.get(i);
    if(student.getId().equals(id)){
      found = true;
      student.setAge(newAge);
      System.out.println("Student age updated successfully!");
    }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void updateStudentGpa(String id, double newGpa){
    boolean found = false;
    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.getId().equals(id)){
        found = true;
        student.setGpa(newGpa);
        System.out.println("Student Gpa updated successfully!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public void updateStudentCountry(String id, String newCountry){
    boolean found = false;
    for(int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.getId().equals(id)){
        found = true;
        student.setCountry(newCountry);
        System.out.println("Student country updated!");
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public int getStudentCount() {
    return students.size();
  }

  public double getAverageGpa() {
    if (students.isEmpty()) {
      return 0;
    }

    double total = 0;
    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);
      total += student.getGpa();
    }
    return total / students.size();
  }

  public int getExcellentStudentCount(){
    int count = 0;
    for (int i = 0; i < students.size(); i++){
      Student student = students.get(i);
      if(student.isExcellentStudent()){
        count++;
     }
    }
    return count;
  }
}
