package ExercisesPart2;

import java.util.Scanner;

public class BankomatBedienung {
    public static void main(String[] args) {

        balanceCheck();
        int choice = option();
        do {
            transaction();
        } while (choice > 0 && choice < 5);
    }

    public static double balanceCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your balance: " );
        double balance = scanner.nextDouble();
        return balance;
    }

    public static int option() {
        System.out.println("Menu: \n" +
                "1. Deposit \n" +
                "2. Withdraw \n" +
                "3. Check Balance \n" +
                "4. Exit" );

        int choice = 0;
        do {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter your choice: " );
            choice = input1.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }

    public static void transaction() {
        Scanner input2 = new Scanner(System.in);
        int choice = option();
        double balance = balanceCheck();

        if (choice < 4) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you wish to deposit: " );
                    double deposit = input2.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Your current balance is: " + balance + " Euro." );
                    System.out.println("Please enter your choice if you wish to make another transaction: " );
                    System.out.println("Menu: \n" +
                            "1. Deposit \n" +
                            "2. Withdraw \n" +
                            "3. Check Balance \n" +
                            "4. Exit" );
                    choice = input2.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to withdraw: " );
                    double withdraw = input2.nextDouble();
                    while (balance < withdraw) {
                        System.out.println("Insufficient Balance! Your available balance is only: " + balance + " Euro." );
                        System.out.println("Enter the amount you wish to withdraw: " );
                        withdraw = input2.nextDouble();
                    }
                    balance = balance - withdraw;
                    System.out.println("Withdrawal successful! Your remaining balance is:" + balance + " Euro." );
                    System.out.println("Please enter your choice if you wish to make another transaction: " );
                    System.out.println("Menu: \n" +
                            "1. Deposit \n" +
                            "2. Withdraw \n" +
                            "3. Check Balance \n" +
                            "4. Exit" );
                    choice = input2.nextInt();
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance + " Euro." );
                    System.out.println("Please enter your choice if you wish to make another transaction: " );
                    System.out.println("Menu: \n" +
                            "1. Deposit \n" +
                            "2. Withdraw \n" +
                            "3. Check Balance \n" +
                            "4. Exit" );
                    choice = input2.nextInt();
                    break;

            }
        } else {
            System.out.println("Thank you for banking with us! Goodbye!" );
        }
    }
}