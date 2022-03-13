package student_aleksandra_jefimova.lesson_3.level_5.task_20;

class Dog {
    int age;

    Dog(int dogAge) {
        this.age = dogAge;
    }

    public int happyBirthday() {
        this.age = this.age + 1;
        return this.age;
    }
    public void voice() {
        System.out.println("Gav Gav");
    }

    public void voiceYourAge(){
        System.out.println("im "+this.age+" year(s) old");
    }
}
