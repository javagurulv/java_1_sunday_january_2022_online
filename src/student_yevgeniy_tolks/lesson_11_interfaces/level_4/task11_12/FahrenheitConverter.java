package student_yevgeniy_tolks.lesson_11_interfaces.level_4.task11_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 273.15;
    }
}
