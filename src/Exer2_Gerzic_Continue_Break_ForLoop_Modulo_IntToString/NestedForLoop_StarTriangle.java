package Exer2_Gerzic_Continue_Break_ForLoop_Modulo_IntToString;

public class NestedForLoop_StarTriangle {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
