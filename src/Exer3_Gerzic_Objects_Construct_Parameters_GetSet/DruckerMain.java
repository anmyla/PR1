package Exer3_Gerzic_Objects_Construct_Parameters_GetSet;

public class DruckerMain {
    public static void main(String[] args) {
        Drucker printer1 = new Drucker("wtf!", 12, 3.2, true);

        System.out.println(printer1.methodPrint(12));
        System.out.println(printer1.methodPrint(4.5));
        System.out.println(printer1.methodPrint("duh!"));
        System.out.println(printer1.methodPrint(true));
    }
}
