package CLASS_Mon_2703;

public class TamagochiMain {
    public static void main(String[] args) {

        Tamagochi pliki = new Tamagochi();
        pliki.y = 4;
        pliki.x = 4;
        pliki.foodStore = 0;

        pliki.foodInventory(10);

        for (int i =0; i < pliki.foodStore; i++) {
            while (pliki.x != 0) {
                pliki.direction("down");
            }
            while (pliki.y != 0) {
                pliki.direction("left");
            }
            System.out.println(" |" + pliki.x + " |" + pliki.y  + " food: " + pliki.foodStore);
        }



    }
}