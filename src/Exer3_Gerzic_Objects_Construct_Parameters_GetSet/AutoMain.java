package Exer3_Gerzic_Objects_Construct_Parameters_GetSet;

public class AutoMain {
    public static void main(String[] args) {
        Auto car1 = new Auto("VW", "Up", 170);
        System.out.println("Make: " +car1.getMake());
        System.out.println("Model: " +car1.getModel());
        System.out.println("PS: " + car1.getPS());

        Auto car2 = new Auto ("BMW", "G30", 220);
        Auto car3 = new Auto("Mini", "Cooper");
        Auto car4 = new Auto();
        Auto car5 = new Auto("Porsche");

        System.out.println();
        System.out.println("Make: " +car3.getMake());
        System.out.println("Model: " +car3.getModel());
        System.out.println("PS: " + car3.getPS());

        System.out.println();
        System.out.println("Make: " +car4.getMake());
        System.out.println("Model: " +car4.getModel());
        System.out.println("PS: " + car4.getPS());

        System.out.println();
        car3.setModel("Porsche");
        car3.setMake("Cayenne");
        car3.setPS(350);
    }
}
