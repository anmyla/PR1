package Exer1_Gerzic_Switch_WhileLoop_Array;

public class Exercise1_StringConcat {

    public static void main(String[] args) {

        String vorname = "Myla";
        String nachname = "Ariaga";

        String name = vorname + " " + nachname;

        int nameLength = name.length();
        System.out.println("The name has exactly " + nameLength + " characters");
        boolean nameLange = name.length() > 10;

        if (nameLange) {
            System.out.println("The name is longer than 10 characters");
        } else {
            System.out.println("The name is shorter than 10");
        }
        System.out.println("Willkommen " + name.toUpperCase());
    }
}




