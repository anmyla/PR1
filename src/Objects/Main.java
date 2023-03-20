package Objects;

public class Main {
    public static void main(String[] args) {
//        Hund dog1 = new Hund();
//        dog1.name = "Mimi";
//        dog1.age = 1;
//        dog1.breed = "German Shepherd";
//        dog1.barking();
//
//
//        dog1.dogInfo();
//        System.out.println("Can " + dog1.name + " bring a stick? " + dog1.dogBringsStick());
// -----------------------------------------------------------------------------------
//        Cat cat1 = new Cat();
//        cat1.name = "Cookie";
//        cat1.breed= "Russian Blue";
//        cat1.age = 1;

//        Cat k1 = new Cat("Cookie", "Grey", "Russian Blue", 1);
//        k1.catMeows();
//        k1.catInfo();
//        System.out.println("Does " + k1.name + " drink Milk? " + k1.catDrinksMilk());
// -----------------------------------------------------------------------------------

        Police p1 = new Police("Mario Schubert", "Jakomini" );

        double speed = p1.speedCheck();
        System.out.println(speed);

        Justice j1 = new Justice();
        j1.calculatePenalty(speed);



    }

}
