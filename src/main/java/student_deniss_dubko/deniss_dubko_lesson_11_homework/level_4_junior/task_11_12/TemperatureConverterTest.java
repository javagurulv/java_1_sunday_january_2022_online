package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_4_junior.task_11_12;

class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.KelvinConverterTest();
        test.FahrenheitConverterTest();
    }

    public void KelvinConverterTest() {
        double celsiusTemperature = 10;
        double expectedKelvinTemperature = 283.15;

        KelvinConverter kelvinConverter = new KelvinConverter();
        double resultKelvin = kelvinConverter.convert(celsiusTemperature);
        if (resultKelvin == expectedKelvinTemperature) {
            System.out.println("Test KelvinConverter = OK");
        } else {
            System.out.println("Test KelvinConverter = FAIL");
        }
    }

    public void FahrenheitConverterTest() {
        double celsiusTemperature = 10;
        double expectedFahrenheit = 50;

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double resultFahrenheit = fahrenheitConverter.convert(celsiusTemperature);
        if (resultFahrenheit == expectedFahrenheit) {
            System.out.println("Test FahrenheitConverter = OK");
        } else {
            System.out.println("Test FahrenheitConverter = FAIL");
        }
    }

}