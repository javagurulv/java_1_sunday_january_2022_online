package student_sergei_klunkov.lesson_3.homework.level_7.task_29;

class Papagoi {

    private String talk;
    private int age;
    private String newColor;

    public Papagoi (int age, String color) {

        this.newColor = color;
        this.age = age;
        this.talk = talk;

    }
    public void talk(String newTalk) {

        this.talk = newTalk;
        System.out.println(this.talk);
        System.out.println("My age is " + this.age);
        System.out.println("My color is " + this.newColor);



    }



}
