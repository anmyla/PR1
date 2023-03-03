package Exercises;

public class DiscountClassSolution {
    public static void main(String[] args) {

        // ----------- Bus Discount -----------------

        double fullBusPrice = 3.2;

        double busTicketEdna = getBusDiscountedPrice(fullBusPrice, true, false, false);
        double busTicketLola = getBusDiscountedPrice(fullBusPrice, false, true, false);
        double busTicketPaul = getBusDiscountedPrice(fullBusPrice, false, false, true);

        double totalBusPriceDiscounted = 2 * (busTicketEdna + busTicketLola + busTicketPaul);
        double totalBusPriceNoDiscount = (3 * 3.2) * 2;

        // ---------- Bookstore Discount -----------------

        int fiction = 2;
        int nonFiction = 2;
        double fullBookPrice = 15 + 18 + 23 + 28;

        double totalBookPriceDiscounted = getBookDiscountPrice(fullBookPrice, fiction, nonFiction);

        //----------- Money Saved from discounts---------
        System.out.println();
        double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPrice) - (totalBusPriceDiscounted + totalBookPriceDiscounted);
        System.out.println("They saved a total of: " + totalSavedMoney + " from all the discounts they got.");
    }

    public static double getBusDiscountedPrice(double fullBusPrice, boolean isSenior, boolean isDog, boolean isStudent) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = fullBusPrice * 0.85;
        } else if (isDog) {
            discountedPrice = fullBusPrice * 0.8;
        } else if (isStudent) {
            discountedPrice = fullBusPrice * 0.9;
        } else {
            discountedPrice = fullBusPrice;
        }
        return discountedPrice;
    }

    public static double getBookDiscountPrice(double fullBookPrice, int fiction, int nonFiction) {
        double discountedBookPrice;
        if ((fiction >= 1) && (nonFiction > 2)) {
            discountedBookPrice = fullBookPrice * 0.9;
        } else {
            discountedBookPrice = fullBookPrice;
        }
        return discountedBookPrice;
    }
}
