package student_alina_strumpe._lesson_3._level_2_middle_Task_22;

public class Dog {

    private String dogColor;

    public Dog(String dogColor){
        this.dogColor = dogColor;
    }
    public String getColor(){ return this.dogColor ;}

    public String changeColor(String newDogColor){ return this.dogColor = newDogColor ;}

    public void voiceVoice(){ System.out.println("GAV");}
}








//    Создайте собаку,
//    заставьте её подать голос,
//    заставте её поменять цвет,
//    заставьте её подать голос снова и убедитесь в том,
//        что собака изменила свой цвет.
