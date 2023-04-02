package CLASS_2903_factorial_staticMethod;

public class Countdown {
    public static void main(String[] args) {

        countdown(10);
    }

    public static void countdown(int counter) {
        if (counter == 0) {
            System.out.println("done");
            return;
        }
        System.out.println(counter);
        counter = counter - 1;
        countdown(counter);
    }
}
