package student_anna_zhoydik.lesson_3.level_7;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person(1200, "Peter", "Pan", "Neverland");
    person.showData();
    person.showAge();
    person.speak();
  }
}
