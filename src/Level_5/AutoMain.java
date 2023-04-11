package Level_5;

public class AutoMain {
    public static void main(String[] args) {
        AutoClass test = new AutoClass("VW", "UP", 2016, 180);

        System.out.println("Year built: " + test.getYear());
       test.setModel("Cross UP");
        System.out.println(test.model);
        test.setYear(2017);
        System.out.println(test.toString());


        test.stepOnGas(130);
        System.out.println(test.speed);
        test.stepOnBreak( 30);
        System.out.println(test.speed);
    }
}
