package HOME_Exercises_Gerzic_Part5;

public class PropertyTax {
    public static void main(String[] args) {


        propertyInfo();
        calculatePayableTax();

    }

    public static void propertyInfo() {
        int[][] property = new int[][]{
                {1, 30, 40},
                {1, 20, 50},
                {3, 10, 30}};

        System.out.println("  Type " + " Length " + "  Width ");
        for (int i = 0; i < property.length; i++) {
            for (int j = 0; j < property[i].length; j++) {
                System.out.print("[  " + property[i][j] + "  ]");
            }
            System.out.println();
        }
    }
//----------------------------------------------------------------------------------------

    public static float calculatePayableTax() {
        int[][] property = new int[][]{
                {1, 30, 40},
                {1, 20, 50},
                {3, 10, 30}};

        float type1PricePerSqM = 3.20f;
        float type2PricePerSqM = 2.10f;
        float type3PricePerSqM = 0.90f;
        float payableTax = 0;
        int type = 0;
        float totalPayableTax = 0f;


        for (int i = 0; i < property.length; i++) {
            type = property[i][0];
            if (type == 1) {
                payableTax = type1PricePerSqM * (property[i][1] * property[i][2]);
                System.out.println("The payable tax for the property in " +i+ " row is " +payableTax+ " Euros ");
                totalPayableTax =  totalPayableTax + payableTax;
                payableTax = 0;
            }
            if (type == 2) {
                payableTax = type2PricePerSqM * (property[i][1] * property[i][2]);
                System.out.println("The payable tax for the property in " +i+ " row is " +payableTax+ " Euros " );
                totalPayableTax =  totalPayableTax + payableTax;
                payableTax = 0;
            }
            if (type == 3) {
                payableTax = type3PricePerSqM * (property[i][1] * property[i][2]);
                System.out.println("The payable tax for the property in " +i+ " row is " +payableTax+ " Euros " );
                totalPayableTax =  totalPayableTax + payableTax;
                payableTax = 0;
            }
        }

        return totalPayableTax;
    }
}
//1.2 Exercise 2 - Calculate property tax
//Create a method grundsteuerBerechnen() in the class Grundsteuer.
//Pass a two-dimensional int array which has multiple rows and 3 columns
//[1, 30, 40]:
//- [1, 30, 40] The three columns are type, length and width of a property.
//For each square meter of area a certain tax has to be paid - the amount of the tax depends on the type of the area.
//tax depends on the type of the area:
//- Type1: 3,20 Euro tax per m2
//- Type 2: 2,10 Euro tax per m2
//- Type 3: 0,90 Euro tax per m2
//Return as return value the sum of the tax to be paid. Create
//at this point also a TestGrund class, from which you call the class
//property tax class and test its methods extensively.
//