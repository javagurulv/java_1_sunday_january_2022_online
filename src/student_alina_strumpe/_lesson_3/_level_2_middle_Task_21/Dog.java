package student_alina_strumpe._lesson_3._level_2_middle_Task_21;

public class Dog {

    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public String setDogName(String dogName){ return this.dogName ; }
    public String getDogName(){ return this.dogName ; }

    public int setDogAge(int dogAge){return this.dogAge ;}
    public int getDogAge(){ return this.dogAge; }

    public String setDogColor(String dogColor){ return this.dogColor ;}
    public String getDogColor(){ return this.dogColor ;}

    public void voiceVoice(){ System.out.println("GAVGAVGAV");}


}









//    Бизнес требования:
//        - Сделайте возможность указывать цвет собаки.
//        - Пусть цвет задаётся просто строкой: "Red", "Black", etc.
//        - Собака должна уметь выполнять команду голос (voice()),
//        при выполнении этой команды на консоль должно выводиться
//        кличка собаки, ее возраст и цвет.





