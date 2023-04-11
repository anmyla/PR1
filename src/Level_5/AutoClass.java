package Level_5;

public class AutoClass {
    String make;
    String model;
    int year;
    double speed;

    public AutoClass(String make, String model, int year, double speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double stepOnGas (double speed) {
        return speed;
    }

    public double stepOnBreak (double speed) {
        return speed;
    }

    public String toString() {
        return "Make: " + make + " Model: " + model + " Year: " +year;
    }
}
