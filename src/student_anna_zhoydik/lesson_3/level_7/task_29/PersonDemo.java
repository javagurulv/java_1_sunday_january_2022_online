package student_anna_zhoydik.lesson_3.level_7.task_29;

import student_anna_zhoydik.lesson_3.level_7.task_29.Person;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person(1200, "Peter", "Pan", "Neverland");
    person.showData();
    person.showAge();
    person.speak();
  }
}
