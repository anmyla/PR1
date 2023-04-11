package Basics;

public class FirstRecursion {
    public static void main(String[] args) {
recurringMethod(99);
    }
    public static int recurringMethod(int bottles){
        if (bottles >=0) {
            System.out.println(bottles + " Bottles of beer on the wall, " + bottles + " Take" +
                    "one down and pass it around, " + bottles + " Bottles of beer on the wall");
            return recurringMethod(bottles-1);
        }
        return -1;
    }
}
