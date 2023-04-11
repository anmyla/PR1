package Basics;

public class MultiplicationTable {
    public static void main(String[] args) {

        int [][] multiTable = new int [10][11];
        int num1 = 10;
        int product = 10;

        for (int i = 0; i < multiTable.length; i++){
            num1= 10 + i;
            for ( int j = 0; j < multiTable[i].length; j++) {
                product = product * num1;
                multiTable[i][j] = product;
                System.out.print(" " + multiTable[i][j]);
                num1++;
                product = 10;
            }
            System.out.println();
        }

    }
}

//Multiplication Table
//Create a new class “MultiplicationTable”.
// Write a program that creates a multiplication table that covers numbers from 10-20.
//It should end up looking like this: