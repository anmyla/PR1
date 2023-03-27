package CLASS_Mon_2703;

public class Auto {
    public String make = "";
    public String model = "";
    public int ps;

    public Auto (String make, String model, int ps) {
    this.make = make;
    this.model= model;
    this.ps = ps;
    }

    public Auto (String make, String model) {
        this.make = make;
        this.model= model;
        this.ps = 0;
    }

    public Auto (String make, int ps) {
        this.make = make;
        this.model= "dummy-model";
        this.ps = ps;
    }

    public Auto (String make) {
        this.make = make;
        this.model= "dummy-model";
        this.ps = 0;
    }

    public Auto () {
        this.make = make;
        this.model = model;
        this.ps = 0;
    }

//    public static String kindOfCar(String make, String model, int ps) {
//        return "Make: " + make + " Model: " + model + " Year: " +ps;
//    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int setPS(int ps){
        this.ps = ps;
        return  ps;
    }

    public int getPS(){
        return ps;
    }

    public void setMake(String make){}

    public void setModel(String model){}

    public double stepOnGas(double speed, double speedUpBy) {
        speed = speed * speedUpBy;
        return speed;
    }

    public double stepOnBreak (double speed, double slowDownBy){
        speed = speed * slowDownBy;
        return speed;
    }

    public String toString() {
        return "Make: " + make + " Model: " + model + " Year: " +ps;
    }
}

