package CLASS_Exercises_Jandl;

public class Katze_ClassInstancesAttributes {
    boolean hasFur;
    boolean hasTail;
    String colour;
    int numberOfLegs;
    public Katze_ClassInstancesAttributes(boolean hasFur, boolean hasTail, String colour, int numberOfLegs) {
        this.hasFur = hasFur;
        this.hasTail = hasTail;
        this.colour = colour;
        this.numberOfLegs = numberOfLegs;
    }
    public String speak() {
        return "Miau";
    }
}
