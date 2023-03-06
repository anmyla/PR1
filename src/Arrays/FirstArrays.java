package Arrays;

public class FirstArrays {
    public static void main(String[] args) {

        //First way of declaring and initialising arrays
        int[] firstArray = new int[5];
        firstArray [0] = 1;
        firstArray [1] = 2;
        firstArray [2] = 3;
        firstArray [3] = 4;
        firstArray [4] = 5;

        //Second way of declaring and initialising arrays
        int[] secondArray = new int[] {1,2,3,4,5};

        //Third way of declaring and initialising arrays. The empty arrays will return a 0.
        int [] thirdArray = new int[5];
        thirdArray[1] = 5;


        ///-----------------------------------------------------------------//
        System.out.println("--------First Array--------");
        for (int i = 0; i < firstArray.length; i++) {
            int itemInArray = firstArray[i];
            System.out.println(itemInArray);
        }

        //-----for each loop-----------------------------
        System.out.println("--------FOR EACH LOOP using First Array--------");
        for (int element : firstArray) {
            element = element + 12;
            System.out.println(element);
        }


        System.out.println("--------Second Array--------");
        for (int i = 0; i < secondArray.length; i++) {
            int itemIn2Array = secondArray[i];
            System.out.println(itemIn2Array);
        }

        System.out.println("--------Third Array--------");
        for (int i = 0; i < thirdArray.length; i++) {
            int itemIn3Array = thirdArray[i];
            System.out.println(itemIn3Array);
        }

    }
}
