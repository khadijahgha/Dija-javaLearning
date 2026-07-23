package condition;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number=10;
        int guess=0;

        while(guess!=number){
            System.out.println("Guess the secret Number: ");
            guess=input.nextInt();

            if(guess<number){
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            }
        }
        System.out.println("Congratulations! you guessed the right number");

//declare a variable for the gaming guess
        String fruit = "Apple";
        String guess1 = "";

        while (!guess1.equals(fruit)) {
            System.out.println("Guess the Fruit name: ");
            guess1 = input.nextLine();

            if (!guess1.equals(fruit)) {
                System.out.println("You guessed the wrong Fruit: ");
            }
        }
        System.out.println("Congratulations! you guessed the right Fruit");
    }
}
