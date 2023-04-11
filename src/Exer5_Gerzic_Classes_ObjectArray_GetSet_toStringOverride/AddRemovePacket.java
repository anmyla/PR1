package Exer5_Gerzic_Classes_ObjectArray_GetSet_toStringOverride;

import java.util.Scanner;

public class AddRemovePacket {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println('\n' + "Menu:");
            System.out.println("0. Add Packet:");
            System.out.println("1. Remove Packet:");
            System.out.println("2. Exit:");

            choice = scanner.nextInt();
        } while (choice != 2);

//        do {
//            menu();
//        } while (choice !=2);

    }

    public  static int menu() {
        System.out.println('\n' + "Menu:");
        System.out.println("0. Add Packet:");
        System.out.println("1. Remove Packet:");
        System.out.println("2. Exit:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }


}
