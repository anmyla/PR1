package HOME_Exercises_Gerzic_Part5;

public class PropertyTaxTest {
    public static void main(String[] args) {
        PropertyTax test1 = new PropertyTax();

        float sumTaxOfAllProperties;

        sumTaxOfAllProperties = test1.calculatePayableTax();
        System.out.println("The sum of all tax payables is: " + sumTaxOfAllProperties);

    }
}
