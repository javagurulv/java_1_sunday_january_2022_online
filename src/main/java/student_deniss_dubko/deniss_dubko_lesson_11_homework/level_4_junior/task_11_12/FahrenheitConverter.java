package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_4_junior.task_11_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

}