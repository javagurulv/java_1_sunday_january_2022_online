package student_vitaly_galuzo.lesson_3.level_7;

 class DogDemo {


    public static void main(String[] args) {

        Dog dog = new Dog("Luna",2.1,3.5,"Dog");

        String dogName = dog.getName();
        double dogAge = dog.getAge();
        double dogWeight = dog.getWeight();


        dog.setWeight(3.1);
        System.out.println("Dog's name  "+ dogName);
        System.out.println("Dog's age "+dogAge+" y.o");
        System.out.println("Dog's weight "+dogWeight+" kg");
        System.out.println("Dog's new weight is "+dog.setWeight(3.1)+" kg");
        System.out.println(dogName);























    }
}
