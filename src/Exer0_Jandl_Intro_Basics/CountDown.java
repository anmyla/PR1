package Exer0_Jandl_Intro_Basics;

public class CountDown {

    public static void main(String[] args) {

        countDown(5);

    }

    public static void countDown(int from) {
        while (from >= 0) {
            System.out.println(from);
            from--;
        }
    }
}
