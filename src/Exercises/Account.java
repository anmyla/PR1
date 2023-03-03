package Exercises;

public class Account {
    public static void main(String[] args) {

        System.out.println("--------------Solution in Main-----------------");
        double investment = 2000;
        double interestRate = 0.025;

        for (int year = 1; year < 11; year++) {
            investment = investment + (investment * interestRate);
            System.out.println("The balance for year " + year + " is " + investment + " Euros");
        }


        System.out.println();
        System.out.println("-----------------Solution in Method--------------------------------");

        calculateBalance(10, 2000, 0.025);
    }

        public static double calculateBalance (int years, double investment, double interestRate) {
            double accountBalance = investment;

            for (int i = 1; i <= years; i++ ) {
                accountBalance = accountBalance + (accountBalance * interestRate);
                System.out.println("The balance for year " + years + " is " + accountBalance + " Euros");
            }
            return accountBalance;
        }
    }

