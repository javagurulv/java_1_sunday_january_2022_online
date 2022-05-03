package student_yevgeniy_tolks.training.imperativeProgramming;

 class Person {
private String name;
private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

     public Gender getGender() {
         return gender;
     }

     @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
