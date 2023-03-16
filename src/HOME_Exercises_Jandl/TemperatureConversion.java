package HOME_Exercises_Jandl;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double tempInCelsius = celsius.nextDouble();
        celsiusToFahrenheit(tempInCelsius);

        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = fahrenheit.nextDouble();
        fahrenheitToCelsius(tempInFahrenheit);

           }
    public static double celsiusToFahrenheit(double tempInCelsius) {
        double temperatureToFahrenheit = (tempInCelsius * 1.8) + 32;
        System.out.println( tempInCelsius + " degree celsius is " + temperatureToFahrenheit + " degree Fahrenheit");
        return temperatureToFahrenheit;
    }
    public static double fahrenheitToCelsius(double tempInFahrenheit) {
        double temperatureToCelsius = (tempInFahrenheit -32) * 0.5556;
        System.out.println( tempInFahrenheit + " degree celsius is " + temperatureToCelsius + " degree Celsius");
        return temperatureToCelsius;
    }

}