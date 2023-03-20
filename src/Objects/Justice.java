package Objects;

public class Justice {
    Police p1 = new Police("Mario Schubert", "Jakomini" );

//    double speed = p1.speedCheck();

    public void calculatePenalty(double speed) {
        if (speed > 130) {
            System.out.println("Penalty!");
        }
        else {
            System.out.println("No penalty!");
        }
    }

}
