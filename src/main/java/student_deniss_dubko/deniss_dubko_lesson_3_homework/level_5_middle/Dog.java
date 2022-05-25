package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_5_middle;

class Dog {

    String dogName;
    int dogAge;
    String dogColor;

    public Dog (String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voiceYourName() {
        System.out.println("Name: " + this.dogName);
    }

    public void voiceYourAge() {
        System.out.println("Age: " + this.dogAge);
    }

    public void voiceYourColor() {
        System.out.println("Colour: " + this.dogColor);
    }

    public void happyBirthday() {
        this.dogAge = dogAge + 1;
        System.out.println("Happy Birthday! Age: " + this.dogAge);
    }

    public void changeColor(String newColor) {
        this.dogColor = newColor;
        System.out.println("New Color: " + this.dogColor);
    }


}