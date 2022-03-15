package student_anna_zhoydik.lesson_3.level_7.task_29;

 class Person {
  int date;
  String name;
  String surname;
  String country;

  Person(int ageOfBirth, String ownersName, String ownersSurname, String ownersCountry) {
    this.name = ownersName;
    this.surname = ownersSurname;
    this.date = ageOfBirth;
    this.country = ownersCountry;
  }

   void showData() {
    System.out.println("name: " + this.name + ", surname: " + this.surname + ", date of birth: " + this.date + ", country: " + country);
  }

  int showAge() {
    this.date = 2022 - this.date;
    return this.date;
  }

   void speak() {
    System.out.println("Hello, my name is " + this.name + this.surname + " and im " + this.date + " years old!");
  }

}
