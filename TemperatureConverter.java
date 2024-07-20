public class TemperatureConverter extends BaseConverter {

    @Override
    double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }


    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double celsius = 25.0;

        double kelvin = temperatureConverter.toKelvin(celsius);
        double fahrenheit = temperatureConverter.toFahrenheit(celsius);

        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Kelvin: " + kelvin + " K");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");



    }
}
