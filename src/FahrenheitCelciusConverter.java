public class FahrenheitCelciusConverter {
    public static double fahrenheitToCelciusConverter(double fahrenheit) {
        //check for illegal argument
        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Number must be greater than -459.67");
        }
        //convert to celius
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celciusToFahrenheitConverter(double celcius) {
        //check for illegal argument
        if (celcius < -273.15) {
            throw new IllegalArgumentException("Number must be greater than -273.15");
        }
        //convert to fahrenheit
        return (celcius * 9 / 5) + 32;
    }
}
