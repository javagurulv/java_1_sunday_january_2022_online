package student_devids_kropacovs.lesson11.level4.task11and12;

public class TemperatureConverterTst {
    public static void main(String[] args) {
        TemperatureConverterTst temperatureConverterTst = new TemperatureConverterTst();
        temperatureConverterTst.temperatureConverterToCelsius();
        temperatureConverterTst.temperatureConverterToFahrenheit();
        temperatureConverterTst.temperatureConverterToKelvin();
    }

    public void temperatureConverterToCelsius(){
        double celsiusTemperature = 10;
        TemperatureConverter temperatureConverter = new CelsiusConverter();
        double result = temperatureConverter.convert(10);
        if (result == celsiusTemperature){
            System.out.println("Convert Celsius to Celsuis test PASS");
        }else{
            System.out.println("Convert Celsius to Celsuis test FAIL");
        }
    }

    public void temperatureConverterToKelvin(){
        double celsiusTemperature = 10;
        double expectedResult = celsiusTemperature + 273.15;
        TemperatureConverter temperatureConverter = new KelvinConverter();
        double result = temperatureConverter.convert(10);
        if (result == expectedResult){
            System.out.println("Convert Celsius to Kelvin test PASS");
        }else{
            System.out.println("Convert Celsius to Kelvin test FAIL");
        }
    }

    public void temperatureConverterToFahrenheit(){
        double celsiusTemperature = 10;
        double expectedResult = 1.8 * 10 + 32;
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        double result = temperatureConverter.convert(10);
        if (result == expectedResult
        ){
            System.out.println("Convert Celsius to Fahrenheit test PASS");
        }else{
            System.out.println("Convert Celsius to Fahrenheit test FAIL");
        }
    }
}
