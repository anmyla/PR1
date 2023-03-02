package Exercises;

public class Discount {
    public static void main(String[] args) {
        double seniorDiscount = 0.15;
        double dogDiscount = 0.20;
        double studentDiscount = 0.10;
        double busTicketFullPrice = 3.20;
        double bookStoreDiscount = 0.10;



        System.out.println("Who is entiled to get a bus ticket discount?");
        checkIfEntitledToABusTicketDiscount(true, true, true);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("Are they entitled to ge a bookstore discount?");
        checkIfEntitledToABookstoreDiscount(2,1);


        System.out.println("---------------------------------------------------------------------");
        System.out.println("Is there money saved from the bookstore discount.");
        calculateBookstoreDiscount(2, 1);


        System.out.println("---------------------------------------------------------------------");

        double moneySavedFromBusTicketsDiscounts = (2 * ((busTicketFullPrice * seniorDiscount) + (busTicketFullPrice * dogDiscount) + (busTicketFullPrice * studentDiscount)));

        System.out.println("Total money saved from all discounts: " + (moneySavedFromBusTicketsDiscounts));

    }

    //-------------------------------------all my functions here-----------------------------//
    public static void checkIfEntitledToABusTicketDiscount(boolean isEdnaASenior, boolean isPaulAStudent, boolean isLolaADog) {
        double seniorDiscount = 0.15;
        double dogDiscount = 0.20;
        double studentDiscount = 0.10;
        double busTicketFullPrice = 3.20;


        double moneySavedFromBusTicket = 0;

        if (isEdnaASenior) {
            System.out.println("Edna is entitled to a 15% senior bus ticket discount");
            moneySavedFromBusTicket = moneySavedFromBusTicket + (2 * (busTicketFullPrice * seniorDiscount));
        } else {
            System.out.println("No discount!");
        }
        if (isLolaADog) {
            System.out.println("Lola is entitled to a 20% dog bus ticket discount");
            moneySavedFromBusTicket = moneySavedFromBusTicket + (2 * (busTicketFullPrice * dogDiscount));
        } else {
            System.out.println("No discount!");
        }
        if (isPaulAStudent) {
            System.out.println("Paul is entitled to a 10% student bus ticket discount");
            moneySavedFromBusTicket = moneySavedFromBusTicket + (2 * (busTicketFullPrice * studentDiscount));
        } else {
            System.out.println("No discount!");
        }
        System.out.println("Total money saved from bus tickets: " + moneySavedFromBusTicket);
    }

    //------------------------------------------------------------------------------------------------------------//
    public static int checkIfEntitledToABookstoreDiscount( int nonFictionBooks, int fictionBooks) {
        double bookStoreDiscount = 0.10;
        boolean entitledToABookstoreDiscount;
        double moneySavedFromBookStoreDiscounts;


        if ((nonFictionBooks >2) && (fictionBooks >0)) {
            entitledToABookstoreDiscount = true;
            System.out.println("You get a bookstore discount!");
            moneySavedFromBookStoreDiscounts = ((23 + 28 + 15 + 18) * bookStoreDiscount);
        } else {
            System.out.println("No discount because you didn't buy enough books!");
        }
      return 0;
    }

    public static int calculateBookstoreDiscount( int nonFictionBooks, int fictionBooks) {
        double bookStoreDiscount = 0.10;
        boolean entitledToABookstoreDiscount;
        double moneySavedFromBookStoreDiscounts;

        if ((nonFictionBooks >2) && (fictionBooks >0)) {
            entitledToABookstoreDiscount = true;
            moneySavedFromBookStoreDiscounts = ((23 + 28 + 15 + 18) * bookStoreDiscount);
            System.out.println("Total money saved from bus ticket: " + (moneySavedFromBookStoreDiscounts));
        } else {
            System.out.println("There is NO money saved from purchasing the books!");
        }
        return 0;
    }
}

//        boolean isEdnaASenior = true;
//        boolean isPaulAStudent = true;
//        boolean isLolaADog = true;

//        double nonFictionBook1Price = 23;
//        double nonFictionBook2Price = 28;
//        double fictionBook1Price = 15;
//        double fictionBook2Price = 18;


//        double discountedBusTicketSenior = busTicketFullPrice - (busTicketFullPrice * seniorDiscount) ;
//        double discountedBusTicketDog = busTicketFullPrice - (busTicketFullPrice * dogDiscount) ;
//        double discountedBusTicketStudent = busTicketFullPrice - (busTicketFullPrice * studentDiscount);

