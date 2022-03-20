package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_5_middle;

class Dog {

    String dogName;
    int dogAge;
    String dogColour;

    public Dog (String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    public void voiceYourName() {
        System.out.println("Name: " + this.dogName);
    }

    public void voiceYourAge() {
        System.out.println("Age: " + this.dogAge);
    }

    public void voiceYourColour() {
        System.out.println("Colour: " + this.dogColour);
    }

    public void happyBirthday() {
        this.dogAge = dogAge + 1;
        System.out.println("Happy Birthday! Age: " + this.dogAge);
    }

    public void changeColor(String newColor) {
        this.dogColour = newColor;
        System.out.println("New Colour: " + this.dogColour);
    }


}