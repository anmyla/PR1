package HOME_Exercises_Gerzic_Part1;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your balance: " );
        double balance = scanner1.nextDouble();

        int choice = 0;
        System.out.println("Please enter your choice: " );
        System.out.println("Menu: \n" +
                "1. Deposit \n" +
                "2. Withdraw \n" +
                "3. Check Balance \n" +
                "4. Exit" );
        do {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter your choice: " );
            choice = scanner3.nextInt();
        } while (choice < 1 || choice > 4);

        do {
            switch (choice) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter the amount you wish to deposit: " );
                    double deposit = input1.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Your current balance is: " + balance + " Euro." );
                    System.out.println("Please enter your choice if you wish to make another transaction: " );
                    System.out.println("Menu: \n" +
                            "1. Deposit \n" +
                            "2. Withdraw \n" +
                            "3. Check Balance \n" +
                            "4. Exit" );
                    do {
                        System.out.println("Enter your choice: " );
                        choice = input1.nextInt();
                    } while (choice < 1 || choice > 4);

                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
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
                    do {
                        System.out.println("Enter your choice: " );
                        choice = input2.nextInt();
                    } while (choice < 1 || choice > 4);

                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Your current balance is: " + balance + " Euro." );
                    System.out.println("Please enter your choice if you wish to make another transaction: " );
                    System.out.println("Menu: \n" +
                            "1. Deposit \n" +
                            "2. Withdraw \n" +
                            "3. Check Balance \n" +
                            "4. Exit" );
                    do {
                        System.out.println("Enter your choice: " );
                        choice = input3.nextInt();
                    } while (choice < 1 || choice > 4);

                    break;
            }
        } while (choice < 4) ;
        System.out.println("Thanks for banking with us! Goodbye!");
    }

//    public static int menu (){
//        int choice = 0;
//        System.out.println("Please enter your choice if you wish to make another transaction: " );
//        System.out.println("Menu: \n" +
//                "1. Deposit \n" +
//                "2. Withdraw \n" +
//                "3. Check Balance \n" +
//                "4. Exit" );
//        do {
//            Scanner scanner2 = new Scanner(System.in);
//            System.out.println("Enter your choice: " );
//            choice = scanner2.nextInt();
//        } while (choice < 1 || choice > 4);
//        return choice;
//    }
}
