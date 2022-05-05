package student_yevgeniy_tolks.lesson_11_interfaces.level_4.task11_12;

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
