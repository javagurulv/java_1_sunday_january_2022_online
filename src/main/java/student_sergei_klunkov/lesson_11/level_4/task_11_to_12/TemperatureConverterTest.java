package student_sergei_klunkov.lesson_11.level_4.task_11_to_12;

class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.fahrenheitTemperatureConverterTest();
        test.kelvinTemperatureConvertTest();

    }
    public void fahrenheitTemperatureConverterTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double celsiusTemperature = 100.00;
        double expectedResultOfConvert = 212;
        double actualResultOfConvert = fahrenheitConverter.convert(celsiusTemperature);
        if (expectedResultOfConvert == actualResultOfConvert){
            System.out.println(" Fahrenheit Temperature Convert " + " - Test passed! ");
        } else {
            System.out.println(" Fahrenheit Temperature Convert " + " - Test failed! ");
        }
    }

    public void kelvinTemperatureConvertTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double celsiusTemperature = 100.00;
        double expectedResultOfConvert = 373.15;
        double actualResultOfConvert = kelvinConverter.convert(celsiusTemperature);
        if (expectedResultOfConvert == actualResultOfConvert) {
            System.out.println(" Kelvin Temperature Convert " + " - Test passed! ");
        } else {
            System.out.println(" Kelvin Temperature Convert " + " - Test failed! ");
        }
    }
}
