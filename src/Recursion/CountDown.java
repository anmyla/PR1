package Recursion;

public class CountDown {
    public static void main(String[] args) {

        doCountDown(10);
    }

    public static void doCountDown(int n) {
        if (n != 0) {
            System.out.println(n);
            n--;
            doCountDown(n);
        } else {
            {
                System.out.println("Finished");
            }
        }
    }
}