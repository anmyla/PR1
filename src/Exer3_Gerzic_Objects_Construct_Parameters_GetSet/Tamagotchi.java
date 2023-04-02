package Exer3_Gerzic_Objects_Construct_Parameters_GetSet;

import java.util.Scanner;

public class Tamagotchi {
    int x;
    int y;
    int foodStore;

    public Tamagotchi(int x, int y, int foodStore) {
        this.x = x;
        this.y = y;
        this.foodStore = foodStore;
    }

    public String feedTamagotchi(int food) {
        this.foodStore = this.foodStore + food;
        return "I fed my Tamagotchi with : " +food+ " food";
    }

    public String findTamagotchi(int x, int y) {
        this.x = x;
        this.y = y;

        return "My Tamagotchi is at position Y: " + y + " and X: " + x;
    }

    public void direction(String direction) {
        direction.toLowerCase();
        if (foodStore < 1) {
            return;
        }
        if (direction.equals("down")) {
            y--;
        } else if (direction.equals("up")) {
            y++;
        } else if (direction.equals("right")) {
            x++;
        } else if (direction.equals("left")) {
            x--;
        }
        foodStore--;
    }

    public void forLoopMethod(int y, int x, int foodStore) {
        System.out.println('\n'+"For-Loop Approach--------------------------");
        System.out.print("[ X: " + x + " ] [food left: " + foodStore + " ]");
        for (int j = x; j > 0; j--) {
            if (foodStore > 1) {
                x--;
                foodStore--;
            } else {
                return;
            }
            System.out.print("[ X: " + x + " ] [food left: " + foodStore + " ]");
        }
        System.out.println();
        System.out.print("[ Y: " + y + " ] [food left: " + foodStore + " ]");
        for (int i = y; i > 0; i--) {
            if (foodStore > 1) {
                y--;
                foodStore--;

            } else {
                return;
            }
            System.out.print("[ Y: " + y + " ] [food left: " + foodStore + " ]");
        }
        System.out.println();
        System.out.println("Position:  | X: " + x + " | Y: " + y + " | food left : " + foodStore);

        if (x == 0 && y == 0) {
            System.out.println("Goal reached successfully!");
        } else {
            System.out.println("Not enough food to reach goal!");
        }
    }

    public void whileLoop(int y, int x, int foodStore) {
        System.out.println('\n' + "While-Loop Approach---------------");
        while (x != 0 && y != 0) {
            System.out.println(" | x: " + x + " | y:" + y + " | food left: " + foodStore);
            if (x >= 0 && foodStore != 0) {
                direction("down");
                foodStore = foodStore - 1;
            }
            if (y >= 0 && foodStore != 0) {
                direction("left");
                foodStore = foodStore - 1;
            }
            x--;
            y--;
        }
        System.out.println(" | x: " + x + " | y:" + y + " | food left: " + foodStore);
    }

    public char[][] printBoard() {
        char[][] position1 = new char[10][10];
        char holder = ' ';

        Scanner axis = new Scanner(System.in);
        System.out.println("Position y-axis (0-9): ");
        int yPosition = axis.nextInt();
        System.out.println("Position x-axis (0-9): ");
        int xPosition = axis.nextInt();

        position1[yPosition][xPosition] = 'X';

        for (int i = 0; i < position1.length; i++) {
            for (int j = 0; j < position1[i].length; j++) {
                if (i == yPosition && j == xPosition) {
                    holder = position1[i][j];
                } else {
                    holder = position1[i][j];
                    holder = '.';
                }
                System.out.print("[ " + holder + " ]");
            }
            System.out.println();
        }
        return position1;
    }
}


