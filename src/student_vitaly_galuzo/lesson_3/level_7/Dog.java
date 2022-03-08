package student_vitaly_galuzo.lesson_3.level_7;

public class Dog {

  String name;
  double age;
  double weight;
  String animal;


  public Dog(String name, double age, double weight,String animal){
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.animal = animal;


  }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    public double setWeight(double newWeight){
      this.weight = newWeight;
      return newWeight;
    }

    }





