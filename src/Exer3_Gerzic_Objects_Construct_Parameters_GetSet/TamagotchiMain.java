package Exer3_Gerzic_Objects_Construct_Parameters_GetSet;

public class TamagotchiMain {
    public static void main(String[] args) {

        System.out.println("Testing some methods with own parameters---------");
        Tamagotchi pliki = new Tamagotchi(4, 4, 0);
        System.out.println(pliki.findTamagotchi(6,7));
        System.out.println(pliki.feedTamagotchi(10) + '\n');

        //using previously initialized variables and calling a method "direction()2, to bring tamagotchi to position x:0, y:0
        System.out.println("Using method direction() ");
        System.out.print("[ X: " + pliki.x + " ] [food left: " + pliki.foodStore + " ]");
        for (int j = pliki.x; j > 0; j--) {
            pliki.direction("left");
            if (pliki.foodStore > 0) {
                System.out.print("[ X: " + pliki.x + " ] [food left: " + pliki.foodStore + " ]");
            }
            else {
                break;
            }
            }
        System.out.println();
        System.out.print("[ Y: " + pliki.y + " ] [food left: " + pliki.foodStore + " ]");
        for (int i = pliki.y; i > 0; i--) {
            pliki.direction("down");
            if (pliki.foodStore>0) {
            System.out.print("[ Y: " + pliki.y + " ] [food left: " + pliki.foodStore + " ]");
            }
            else {
                break;
            }
        }
        System.out.println();
        System.out.println("Position:  | X: " + pliki.x + " | Y: " + pliki.y + " | food left : " + pliki.foodStore);

        if (pliki.x == 0 && pliki.y == 0) {
            System.out.println("Goal reached successfully!");
        } else {
            System.out.println("Not enough food to reach goal!");
        }

        pliki.forLoopMethod(2,2, 5);
        pliki.whileLoop(6,6,26); //use new  values from own parameters
    }
}