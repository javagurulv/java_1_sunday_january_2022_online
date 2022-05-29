package student_sergei_klunkov.lesson_11.level_4.task_11_to_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
