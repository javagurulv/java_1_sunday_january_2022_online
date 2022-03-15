package student_anna_zhoydik.lesson_3.level_7.task_29;

class Country {
  String name;
  int people;
  String president;
  boolean euroUnit;

  Country(String countryName, int peopleInCountry, String President) {
    this.name = countryName;
    this.people = peopleInCountry;
    this.president = President;
    this.euroUnit = false;
  }

  void getInfo() {
    System.out.println("In " + name + " is living " + people + " people. And the president of this country is " + president + ",also is " + this.euroUnit + " that this country is the part of Eurounit");
  }

  void partOfEuroUnit() {
    this.euroUnit = true;
  }

  void afterYear(int peopleQuantity) {
    this.people = peopleQuantity;
  }

  int comingPeople() {
    this.people = this.people + 2000;
    return this.people;
  }
}

