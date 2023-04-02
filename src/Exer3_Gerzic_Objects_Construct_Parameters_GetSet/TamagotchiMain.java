package Exer3_Gerzic_Objects_Construct_Parameters_GetSet;

public class TamagotchiMain {
    public static void main(String[] args) {
        Tamagotchi pliki = new Tamagotchi(4, 4, 0);
        System.out.println("Fed my Tamagotchi with : " +pliki.feedTamagochi(10) + " food" + '\n');

        pliki.forLoop(); //takes previously initialized values

        pliki.whileLoop(6,6,26); //use new  values from these parameters


//----------------------------1st TRY working-----------------------------------------

    }
}