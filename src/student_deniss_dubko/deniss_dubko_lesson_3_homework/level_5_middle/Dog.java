package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_5_middle;

class Dog {

    private String name;

    public Dog(String dogName) {

        this.name = dogName;
    }

    public void voiceYourName() {

        System.out.println(this.name);
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog Java = new Dog("Java");
        Java.voiceYourName();
        Java.voiceYourName();
        Java.voiceYourName();
    }


}