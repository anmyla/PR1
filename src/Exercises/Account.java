package Exercises;

public class Account {
    public static void main(String[] args) {
        double investment = 2000;
        double interestRate = 1.025;

        for (int year = 1; year < 11; year++) {
            investment = investment * interestRate;
            System.out.println("The balance for year " + year + " is " + investment + " Euros");
        }
        }
    }

