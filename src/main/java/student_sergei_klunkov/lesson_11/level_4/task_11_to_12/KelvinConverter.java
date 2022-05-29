package student_sergei_klunkov.lesson_11.level_4.task_11_to_12;

class KelvinConverter implements TemperatureConverter {

 @Override
 public double convert(double celsiusTemperature) {
  return celsiusTemperature + 273.15;
 }

}
