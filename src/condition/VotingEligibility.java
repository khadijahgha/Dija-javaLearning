package condition;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please what is your age?");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("you are not yet Eligible to vote");
        }
        System.out.println("Wait until you are 18 or above!");
    }
}
