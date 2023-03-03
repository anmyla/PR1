package Exercises;

public class DoCount {
    public static void main(String[] args) {

        countUp(98);

        System.out.println("--------------------------------------------");
        conditionProblemSolution(true);

        System.out.println("--------------------------------------------");
        conditionProblemSolution2(1);

        System.out.println("--------------------------------------------");
        conditionProblemSolution2(3);

    }

    public static void countUp(int counter) {
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 100);

    }

    public static void conditionProblemSolution(boolean right) {
        while (right) {
            System.out.println("1");
            right = false;
        }
    }

    public static void conditionProblemSolution2(int right) {
        while (right <= 5) {
            System.out.println(right);
            right++;
        }
    }

    public static void conditionProblemSolution3(int right) {
        do {
            System.out.println(right);
            right++;
        } while (right <= 5);
    }
}
