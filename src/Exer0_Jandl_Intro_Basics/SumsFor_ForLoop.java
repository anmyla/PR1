package Exer0_Jandl_Intro_Basics;

public class SumsFor_ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Print line 5 times.");
        }
    }
}
