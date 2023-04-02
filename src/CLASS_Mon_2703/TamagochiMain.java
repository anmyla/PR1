package CLASS_Mon_2703;

import java.util.Scanner;

public class TamagochiMain {
    public static void main(String[] args) {
        char where = 'X';

        char[][] position = new char[10][10];
        char holder = ' ';

        Scanner axis = new Scanner(System.in);
        System.out.println("Positon y-axis (0-9): " );
        int yPosition = axis.nextInt();
        System.out.println("Positon x-axis (0-9): " );
        int xPosition = axis.nextInt();

        position[yPosition][xPosition] = 'X';

        for ( int i = 0; i < position.length; i++) {
            for ( int j = 0; i < position[i].length; j++) {
                if (i == yPosition && j == xPosition) {
                    position[i][j] = 'X';
                } else {
                    position[i][j] = ' ';
                }
                holder = position[i][j];
                System.out.print("[ " + holder + " ]");
            }
            System.out.println();
        }

        Tamagochi pliki = new Tamagochi(4, 4, 0);
        pliki.feedTamagochi(10);


//----------------------------1st TRY-----------------------------------------
        for (int i = pliki.y; i > 0; i--) {
            pliki.direction("down");
        }
        for (int j = pliki.x; j > 0; j--) {
            pliki.direction("left");
        }
        System.out.println(" |" + pliki.x + " |" + pliki.y + " food: " + pliki.foodStore);

//-----------------------------2nd TRY-----------------------------------------

//        while (pliki.x!=0 && pliki.y !=0){
//            System.out.println(" | x: " + pliki.x + " | y:" + pliki.y + " | food: " + pliki.foodStore);
//            if(pliki.x>=0 && pliki.foodStore != 0) {
//                pliki.direction("down");
//            }
//            if(pliki.y>=0 && pliki.foodStore != 0) {
//                pliki.direction("left");
//            }
//        }
//        System.out.println(" | x: " + pliki.x + " | y:" + pliki.y + " | food: " + pliki.foodStore);


//----------------------------------3rd TRY-----------------------------------------


//                position[pliki.y][pliki.x] = where;
//                System.out.print("[ " + where + " ]");
        int xAxis = pliki.x;
        int yAxis = pliki.y;

        while (pliki.x != 0 && pliki.y != 0) {
            for (int i = 0; i < yAxis; i++) {
                for (int j = 0; j <= xAxis; j++) {
                    if (i == 0 && j == pliki.x) {
                        position[i][j] = where;
                        System.out.print("[ " + where + " ]");
                        pliki.direction("down");
                    } else {
                        System.out.print("[ " + " ]");
                    }
                }
//                if (pliki != 0 && i == pliki.y) {
//                    position[i][pliki.x] = where;
//                    System.out.print("[ " + where + " ]");
//                    pliki.direction("down");
//
//                } else {
//                    System.out.print("[ " + " ]");
//                }
//
//                System.out.println();
            }
        }
    }
}
