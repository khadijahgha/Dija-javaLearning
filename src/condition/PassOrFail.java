package condition;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score here: ");
        int score = input.nextInt();

        if(score >= 50){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
