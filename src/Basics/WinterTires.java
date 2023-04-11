package Basics;

public class WinterTires {
    public static void main(String[] args) {

        if (needWinterTres(15, true)){
            System.out.println("Please use winter tires!");
        } else {
            System.out.println("Winter tires are not required!");
        }

        if (needWinterTres(3, false)){
            System.out.println("Please use winter tires!");
        } else {
            System.out.println("Winter tires are not required!");
        }

    }
    public static boolean needWinterTres(int temp, boolean isRoadSlippery){
        boolean winterTires = false;
        if ( (temp < 10 && isRoadSlippery)|| temp <4) {
            winterTires = true;
        }
        return winterTires;
    }
}

//WinterTires
//Create a new class named "WinterTires". Write a static method to determine
// whether winter tires should be used:
//public static boolean needWinterTires (int temperature, boolean slipperyRoad) { ... }
//Winter tires should be used if:
//		Temperature < 10°C and the road is slippery.
//		Temperature < 4°C
//Call the method in the main program using different values, and depending on the return,
// write the text "Please use winter tires" or "Winter tires are not required" and check if
// your results make sense.WinterTires
//Create a new class named "WinterTires". Write a static method
// to determine whether winter tires should be used:
//public static boolean needWinterTires (int temperature, boolean slipperyRoad) { ... }
//Winter tires should be used if:
//		Temperature < 10°C and the road is slippery.
//		Temperature < 4°C
//Call the method in the main program using different values, and depending on the return,
// write the text "Please use winter tires" or "Winter tires are not required" and check
// if your results make sense.