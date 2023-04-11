package Basics;

import java.sql.SQLOutput;

public class Discount {
    public static void main(String[] args) {
        boolean isSenior;
        boolean isDog;
        boolean isStudent;
        double savedMoneyFromAllDiscounts = withoutDiscounts() - discountedBusFare(true, true, true) - bookstoreDiscount(2,2);

        System.out.println("The total amount they spent if there were no discounts would be: " + withoutDiscounts());
        System.out.println("The total amount they paid in the bus :" + discountedBusFare(true, true, true));
        System.out.println("The total amount they spent in the bookstore : " + bookstoreDiscount(2,2));
        System.out.println("The total amount they saved from the discounts is : " + savedMoneyFromAllDiscounts);
    }

    public static double discountedBusFare(boolean isSenior, boolean isDog, boolean isStudent) {
        double seniorDiscount = 0.15;
        double dogDiscount = 0.2;
        double studentDiscount = 0.10;
        double busFullPrice = 3.20;
        double totalDiscountedBusFare = 0;
        double  busTicketWithSeniorDiscount;
        double busTicketWithDogDiscount;
        double busTicketWithStudentDiscount;

        if (isSenior) {
            busTicketWithSeniorDiscount = busFullPrice - (busFullPrice * seniorDiscount);
        }
        else {
            busTicketWithSeniorDiscount = busFullPrice;
        }
        if (isDog) {
            busTicketWithDogDiscount = busFullPrice - (busFullPrice * dogDiscount);
        }
        else {
            busTicketWithDogDiscount = busFullPrice;
        }
        if (isStudent) {
            busTicketWithStudentDiscount = busFullPrice - (busFullPrice * studentDiscount);
        }
        else {
            busTicketWithStudentDiscount = busFullPrice;
        }
        totalDiscountedBusFare = (busTicketWithSeniorDiscount + busTicketWithDogDiscount + busTicketWithStudentDiscount) * 2;

        return totalDiscountedBusFare;
    }

    public static double bookstoreDiscount(int nonfic, int fic) {
        double bookstoreDiscount = 0.10;
        double totalBookstoreDiscount;
        if (nonfic > 2 && fic >= 1) {
            totalBookstoreDiscount = (15 + 18+ 23 + 28)* bookstoreDiscount;
        }
        else {
            totalBookstoreDiscount = (15 + 18+ 23 + 28);
        }
        return totalBookstoreDiscount;
    }

    public static double withoutDiscounts() {
        double totalSpendingWithoutDiscount;
        return totalSpendingWithoutDiscount = (3.20 * 6) + 15 +18 + 23 +28;
    }
}

//Discount
//Create a new class “Discount”.
//On the bus you receive a discount if you are a senior citizen (-15%),
// a dog (-20%) or a student (-10%). The full prize for a bus ticket is 3,20 Euros.
//In a bookshop you receive a discount if you buy more than 2 non-fiction
// books and at least one fiction book (-10%).
//Think about what datatypes are appropriate for the variables you need to declare.
//How much can Edna (a senior citizen), her dog Lola, and her grandson
// Paul save if they take the bus in both directions and buy a fictio
//n (for 15 and 18 Euros) and a non-fiction (for 23 and 28 Euros) book each?
//Write the results to the console.