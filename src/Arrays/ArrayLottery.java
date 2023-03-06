package Arrays;

public class ArrayLottery {
    public static void main(String[] args) {
        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 6;
        myLotteryGuesses[1] = 16;
        myLotteryGuesses[2] = 10;
        myLotteryGuesses[3] = 41;
        myLotteryGuesses[4] = 43;
        myLotteryGuesses[5] = 35;

        int[] winningNumbers = getRandomLotteryNumbers();

        int countMatches = 0;
        for (int i = 0; i < myLotteryGuesses.length; i++) {
            if (myLotteryGuesses[i] == winningNumbers[i]) {
                countMatches =countMatches +1;
            }
        }

        if (countMatches == 6) {
            System.out.println("Jackpot! ");
        } else if (countMatches == 5) {
            System.out.println("Second Price!");
        } else if (countMatches == 4) {
            System.out.println("Third Price!");
        }
        else {
            System.out.println("Better luck next time!");
        }
    }

    public static int[] getRandomLotteryNumbers() {
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++)  {
            int number = (int) (Math.random() * 100);
            while (number > 49 || number < 1) {
                number = (int) (Math.random() * 100);
            }
            randomNumbers[i] = number;
        }
        return randomNumbers;
    }
}
