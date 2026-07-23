package arraylists;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();

        students.add("Ali");
        students.add("John");
        students.add("Mary");
        students.add("Sarah");
        students.add("David");

        System.out.println("Student Lists");
        System.out.println("-------------");

        for (int i =0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
        System.out.println("First student: " + students.get(0));
        System.out.println("Last Student: " + students.get(students.size()-1));
        System.out.println("total student: " + students.size());
    }
}
