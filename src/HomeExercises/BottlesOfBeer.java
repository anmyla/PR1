package HomeExercises;

public class BottlesOfBeer {
    public static void main(String[] args) {
        song(" Bottles of Beer on the wall ", " Bottles of Beer", "Take 1 down and pass it around ");
    }

    public static void song( String line1, String line2, String line3) {
        int bottles = 99;
        while (bottles != 0) {
            System.out.println(bottles + line1 + bottles + line2);
            bottles--;
            System.out.println(line3 + bottles + line1);
            System.out.println();
        }
            System.out.println("We are all drunk!");
        }
    }