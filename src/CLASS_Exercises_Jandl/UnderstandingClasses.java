package CLASS_Exercises_Jandl;

public class UnderstandingClasses {
    public static void main(String[] args) {

        //"Katze" is a class we created and we also created its functions.
        //Now we can make an "instance" of the class "Katze".
        Katze mieze = new Katze(true, true, "Grey", 4);
        Katze schnurrbert = new Katze (true, true, "Red brown", 4);
        Katze cookie = new Katze (true, true, "n/a", 4);

        //We can also call the funtions of the class "Katze"
        String miezeSpeaks = mieze.speak();
        System.out.println(miezeSpeaks);
        System.out.println(cookie.speak());
    }
}
