package HOME_Exercises_Gerzic_Part5;

public class AutoTest {
    public static void main(String[] args) {
        Auto car1 = new Auto();
        car1.make =  "Audi ";
        car1.model= " A6  ";
        car1.year = 2017;
        car1.speed = 0;
        //-----toString Method-------
        System.out.println(car1.toString());



        //-----stepOnGas Method ----------
        System.out.println("Increased speed by 100% : " + car1.stepOnGas(70,2));

        //-----stepOnBreak Method ----------
        System.out.println("Decreased speed by half: " + car1.stepOnBreak(140,2));

        //-------Use Setter Method-----------
        Auto.setMake("BMW");
        Auto.setModel("X4");

        //-------Use Getter Method--------
        System.out.println(Auto.getMake());
        System.out.println(Auto.getModel());


        //-------2nd Instance-------
        System.out.println("-------------2nd Instance--------------");
        Auto car2 = new Auto();

        System.out.println(car2.kindOfCar("Porsche", "Cayenne", 2019));



    }
}
