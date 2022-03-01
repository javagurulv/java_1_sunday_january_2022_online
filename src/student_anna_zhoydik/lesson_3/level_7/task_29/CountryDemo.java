package student_anna_zhoydik.lesson_3.level_7.task_29;

import student_anna_zhoydik.lesson_3.level_7.task_29.Country;

public class CountryDemo {
  public static void main(String[] args) {
    Country country = new Country("Estonia", 1330000, "Alar Karis");
    country.getInfo();
    country.partOfEuroUnit();
    country.afterYear(1330003);
    country.comingPeople();
    country.getInfo();
  }
}
