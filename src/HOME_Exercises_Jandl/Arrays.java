package HOME_Exercises_Jandl;

public class Arrays {
    public static void main(String[] args) {

        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + i;
        }
       printArray(numbers);
    }

    private static void printArray(int array[]) {
        for (int i : array) {
            System.out.println(i);
        }
    }

//    public static boolean containsNumber(int[] numbers, int n){
//        boolean check;
//        check = number
//        return false;
//    }

}
