package HOME_Exercises_Gerzic_Part5;

public class Auto {
     public String make = "";
    public String model = "";
    public int year;
    double speed;


    public static String kindOfCar(String make, String model, int year) {
        return "Make: " + make + " Model: " + model + " Year: " +year;
    }

    public static String getMake(){
        String make = "Volkswagen";
        return make;
    }

    public static String getModel(){
        String model = "VW Cross UP";
        return model;
    }

    public static void setMake(String make){}

    public static void setModel(String model){}

    public static double stepOnGas(double speed, double speedUpBy) {
        speed = speed * speedUpBy;
        return speed;
    }

    public static double stepOnBreak (double speed, double slowDownBy){
        speed = speed * slowDownBy;
        return speed;
    }

    public String toString() {
        return "Make: " + make + " Model: " + model + " Year: " +year;
    }
}
