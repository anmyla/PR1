package HOME_Exercises_Gerzic_Part5;

import java.util.Scanner;

public class PropertyTax {
    int type = 0;
    int length = 0;
    int width = 0;
    double valuePropertyPerRow = 0;
    float valuePerMeter = 0;
    double totalValueAllProperties = 0;
    int[][] property = new int[][]{
            {1, 30, 40},
            {1, 20, 50},
            {3, 10, 30}};


    public void propertyInfo() {

        System.out.println("  Type " + " Length " + "  Width ");
        for (int i = 0; i < property.length; i++) {
            for (int j = 0; j < property[i].length; j++) {
                System.out.print("[  " + property[i][j] + "  ]");
            }
            System.out.println();
        }
    }

    public void propertyInfoDynamic() {
        int[][] newProperty = new int[3][3];
        Scanner input = new Scanner(System.in);

        this.property = newProperty;
        this.type = type;
        this.length = length;
        this.width = width;
        this.valuePropertyPerRow = valuePropertyPerRow;
        this.valuePerMeter = valuePerMeter;
        this.totalValueAllProperties = valuePerMeter;


        for (int i = 0; i < newProperty.length; i++) {
            for (int j = 0; j < newProperty[i].length; j++) {
                if (j == 0) {
                    System.out.println("What is the property type? (0,1,2):  ");
                    newProperty[i][j] = input.nextInt();
                    type = newProperty[i][j];
                }
                if (j == 1) {
                    System.out.println("What is the length of the property in meters:  ");
                    newProperty[i][j] = input.nextInt();
                    length = newProperty[i][j];
                }
                if (j == 2) {
                    System.out.println("What is the width of the property in meters:  ");
                    newProperty[i][j] = input.nextInt();
                    width = newProperty[i][j];
                }

                switch (type) {
                    case 0:
                        valuePerMeter = 3.20f;
                        break;
                    case 1:
                        valuePerMeter = 2.10f;
                        break;
                    case 2:
                        valuePerMeter = 0.90f;
                        break;
                    default:
                        valuePerMeter = 0;
                }

                System.out.println();
                valuePropertyPerRow = (length * width) * valuePerMeter;
                totalValueAllProperties = totalValueAllProperties + valuePropertyPerRow;
            }

            System.out.println("The value of this property is : " + valuePropertyPerRow);
        }


        System.out.println();
        System.out.println("  Type " + " Length " + "  Width ");
        for (int i = 0; i < newProperty.length; i++) {
            for (int j = 0; j < newProperty[i].length; j++) {
                System.out.print("[  " + newProperty[i][j] + "  ]");
            }
            System.out.println();
        }

        System.out.println('\n' + "The total value of all properties is: " + totalValueAllProperties);
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
                System.out.println("The payable tax for the property in " + i + " row is " + payableTax + " Euros ");
                totalPayableTax = totalPayableTax + payableTax;
                payableTax = 0;
            }
            if (type == 2) {
                payableTax = type2PricePerSqM * (property[i][1] * property[i][2]);
                System.out.println("The payable tax for the property in " + i + " row is " + payableTax + " Euros ");
                totalPayableTax = totalPayableTax + payableTax;
                payableTax = 0;
            }
            if (type == 3) {
                payableTax = type3PricePerSqM * (property[i][1] * property[i][2]);
                System.out.println("The payable tax for the property in " + i + " row is " + payableTax + " Euros ");
                totalPayableTax = totalPayableTax + payableTax;
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