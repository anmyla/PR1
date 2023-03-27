package CLASS_Mon_2703;

import java.sql.SQLOutput;

public class DruckerMain {
    public static void main(String[] args) {
        Drucker printer1 = new Drucker("gdlsjfböJ", 12, 3.2, true);

        System.out.println(printer1.methodPrint(12));
        System.out.println(printer1.methodPrint(4.5));
        System.out.println(printer1.methodPrint("khsfökshFDÖ"));
        System.out.println(printer1.methodPrint(true));
    }
}
