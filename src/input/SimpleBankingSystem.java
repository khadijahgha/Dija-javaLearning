package input;
import java.util.Scanner;
public class SimpleBankingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double balance = 3000;
        int choice = 0;

        while (choice!=4){
            System.out.println("Choose option:");
            System.out.println("===Bank Menu===");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            choice= input.nextInt();

            if(choice==1){
                System.out.println("Check balance");
                System.out.println("Balance = " + balance);
            }

            else if(choice==2){
                System.out.println("Enter deposit amount:");
                double amount =input.nextDouble();
                balance += amount;
                System.out.println("Deposite amount = " + balance);
            }
            else if(choice==3){
                System.out.println("Enter withdraw amount:");
                double amount = input.nextDouble();

                if(amount>balance){
                    System.out.println("Insufficient balance");
                }
                else{
                    balance -= amount;
                    System.out.println("Thank you for banking with us!");
                }
            }
        }
    }
}
