package house;

public class Kitchen {
    public static void main(String[] args) {


        float squareMeterKitchen = 43.2f;
        float pricePerSquareMeterKitchen = 1736.42f;

        //address
        String address = "12 Haus am Meer";

        // appliances list
        float fridge = 5340f;
        float stove = 9539f;
        float dishwasher = 8873f;
        float microwave = 1234f;
        float riceCooker = 723f;
        float oven = 7233f;
        float exhaust = 4745f;

        float appliances = fridge + stove + dishwasher + microwave + riceCooker + oven + exhaust;

        float totalPrice = (squareMeterKitchen  * pricePerSquareMeterKitchen) + appliances;


        System.out.println("The kitchen in " + address + " has " + squareMeterKitchen + " sq.m.");
        System.out.println("The price of the appliances alone is: " + appliances + ".");
        System.out.println("The total price of this kitchen with appliances is " + totalPrice + " Euros.");


    }
}
