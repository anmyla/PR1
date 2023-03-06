package Arrays;

public class FirstArrays {
    public static void main(String[] args) {

        int[] firstArray = new int[5];

        firstArray [0] = 1;
        firstArray [1] = 2;
        firstArray [2] = 3;
        firstArray [3] = 4;
        firstArray [4] = 5;

        int[] secondArray = new int[] {1,2,3,4,5};

        for (int i = 0; i < firstArray.length; i++) {
            int itemInArray = firstArray[i];
            System.out.println(itemInArray);
        }
    }
}
