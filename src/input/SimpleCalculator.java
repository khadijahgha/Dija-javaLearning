package input;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Substraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " +(firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber/secondNumber));
        System.out.println((firstNumber * secondNumber) + (firstNumber-secondNumber));
    }
}
