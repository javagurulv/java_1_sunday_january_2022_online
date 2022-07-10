package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_4_junior.task_11_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}