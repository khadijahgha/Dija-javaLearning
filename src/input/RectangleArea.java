package input;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int length = input.nextInt();

        System.out.println("Enter the width: ");
        int width = input.nextInt();

        System.out.println("Area = " + (length * width));
        System.out.println("Done!");
    }
}
