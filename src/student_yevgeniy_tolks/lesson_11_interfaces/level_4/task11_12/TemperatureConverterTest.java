package student_yevgeniy_tolks.lesson_11_interfaces.level_4.task11_12;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.KelvinConverterTest();
        test.FahrenheitConverterTest();
    }

    public void KelvinConverterTest() {
        double celsiusTemperature = 20;
        double expectedTemperatureInKelvin = 293.15;

        KelvinConverter kelvinConverter = new KelvinConverter();
        double resultInKelvin = kelvinConverter.convert(celsiusTemperature);
        if (resultInKelvin == expectedTemperatureInKelvin) {
            System.out.println("Converted correctly - TEST OK");
        } else {
            System.out.println("Conversion went wrong - TEST FAILED");
        }
    }

    public void FahrenheitConverterTest() {
        double celsiusTemperature = 20;
        double expectedTemperatureInFahrenheit = 68;

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double resultInFahrenheit = fahrenheitConverter.convert(celsiusTemperature);
        if (resultInFahrenheit == expectedTemperatureInFahrenheit) {
            System.out.println("Converted correctly - TEST OK");
        } else {
            System.out.println("Conversion went wrong - TEST FAILED");
        }
    }
}
