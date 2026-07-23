package arraylists;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        for (int i =0; i<5; i++){
            System.out.println("Enter the book title: ");
            String bookTitle = input.nextLine();
            books.add(bookTitle);
        }

        System.out.println("Books Title");
        System.out.println("-------------");
        for(int i=0; i<books.size(); i++){
            System.out.println(books.get(i)); // syntax display all books
        }

        System.out.println("Total= " + books.size()); // the number of books stored

        //Search for a book
        System.out.println("Enter the book title you want to search:");
        String search = input.nextLine();

        if(books.contains(search)){
            System.out.println("book available!");
        }
        else {
            System.out.println("book not available!");
        }

        //Adding another book
        int choice =0;
        while (choice!=2){
            System.out.println("Do you want to add another book?");
            System.out.println("1.Yes");
            System.out.println("2.No");

            choice = input.nextInt();
            input.nextLine(); // to clear enter key

            if(choice==1){
                System.out.println("Enter the name of the book title you want to add:");
                String bookTitle = input.nextLine();
                books.add(bookTitle);

                System.out.println("Book added successfully!");
            }
            else if(choice==2){
                System.out.println("Thank you!");
            }

            for(String book:books){
                System.out.println(books);
            }
        }
    }
}
