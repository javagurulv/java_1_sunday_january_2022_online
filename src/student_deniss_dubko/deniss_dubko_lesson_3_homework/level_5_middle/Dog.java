package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_5_middle;

class Dog {

    String dogName;
    int dogAge;

    public Dog (String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voiceYourName() {
        System.out.println("Name: " + this.dogName);
    }

    public void voiceYourAge() {
        System.out.println("Age: " + this.dogAge);
    }


}