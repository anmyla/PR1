package Level_1;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        double deposit = 0;
        double withdrawal = 0;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Balance: ");
        double balance = scanner.nextDouble();

        choice = menu();

        while (choice > 0 || choice < 5) {
            if (choice == 1) {
                System.out.println("Enter the amount you wish to deposit: ");
                deposit = scanner.nextDouble();
                balance = balance + deposit;
                System.out.println("Your current balance is: " + balance);
            } else if (choice == 2) {
                System.out.println("Enter the amount you wish to withdraw: ");
                withdrawal = scanner.nextDouble();
                if (balance < withdrawal) {
                    System.out.println("insufficient balance");
                } else {
                    balance = balance - withdrawal;
                    System.out.println("Your current balance is: " + balance);
                }
            } else if (choice == 3) {
                System.out.println("Your current balance is: " + balance);
            } else if (choice < 1 || choice > 4) {
                System.out.println("Invalid input, please try again!");
            } else {
                return;
            }
            choice = menu();
        }
    }


    public static int menu() {
        System.out.println('\n' + "Menu:");
        System.out.println("1. Deposit:");
        System.out.println("2. Withdraw:");
        System.out.println("3. Check balance:");
        System.out.println("4. Exit:");
        System.out.println("Enter your choice ( 1-4): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        return choice;
    }
}
