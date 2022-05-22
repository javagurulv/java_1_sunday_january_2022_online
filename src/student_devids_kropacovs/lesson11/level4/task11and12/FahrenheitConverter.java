package student_devids_kropacovs.lesson11.level4.task11and12;

class FahrenheitConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
