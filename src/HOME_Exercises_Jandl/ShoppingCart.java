package HOME_Exercises_Jandl;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] items = new String[]{"Banana", "Pineapple", "Guava", "Avocado", "Mango"};
        double[] prices = new double[]{0.40, 4.5, 2.4, 1.8, 2.1};

        for (int i = 0; i < prices.length; i++) {
            double cost = prices[i];
            String fruit = items [i];
                System.out.println(fruit + " costs " + cost + " Euros");
            }
        }
    }
//Shopping Cart
//In your new class “ShoppingCart” create two arrays,
// one that contains the names of some items that you want to
// put in your shopping cart, the second contains the prices for all of your items.
//Print the contents of your shopping cart to the console with the corresponding price!
