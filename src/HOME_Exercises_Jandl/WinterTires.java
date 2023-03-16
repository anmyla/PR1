package HOME_Exercises_Jandl;

public class WinterTires {
    public static void main(String[] args) {
    needWinterTires(20, true);
    needWinterTires(9, false);
    needWinterTires(7, true);
    needWinterTires(8, false);
    needWinterTires(3, false);

    }
    public static boolean needWinterTires (int temp, boolean slipperyRoad) {
        if (temp < 4) {
            System.out.println("Be safe! Using winter tires is must in this condition!");
        }
        else if (temp < 10 && slipperyRoad) {
            System.out.println("Be safe! Use winter tires!");
        }
        else {
            System.out.println("Winter tires are not required.");
        }
        return true;
    }
}

