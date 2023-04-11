package Level_2;

public class Fibonacci {
    public static void main(String[] args) {

        fibonacci(20);
    }
    public static void fibonacci(int numInput){
        int addend1 = 0;
        int addend2 = 1;
        int sum = 0;

         for (int i = 0; i <numInput; i++) {
                sum = addend1 + addend2;
             System.out.print(" " + sum);
                addend1 = addend2;
                addend2 = sum;
         }
    }
}
