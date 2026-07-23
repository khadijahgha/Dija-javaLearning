package conditionsandloops;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number + "x" + i + "=" + (number * i));

        }

        input.nextLine();

        System.out.println("Enter your score: ");
        int score =input.nextInt();

        if(score>=80){
            System.out.println("Grade A");
        }
        else if(score>=70){
            System.out.println("Grade B");
        }
        else if(score>=60){
            System.out.println("Grade C");
        }
        else if(score>=50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

        for(int i=1; i<=10; i++){
            System.out.println("Ibtihaj");
        }

        int i=3;
        while(i<=6){
            System.out.println(i);
            i++;
        }
    }
}
