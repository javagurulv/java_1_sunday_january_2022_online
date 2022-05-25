package student_alina_strumpe._lesson_3._level_2_middle_Task_20;

public class Dog {

    public int dogAge;

    public Dog(int dogAge){
        this.dogAge = dogAge;
            }

    public int setDogAge(int dogAge){ return this.dogAge;}

    public void voiceVoice() { System.out.println("GAV");}

    public void happyBirthday() { System.out.println("My Birthday today!");}

    public int calculateDogAge(int newDogAge) { return this.dogAge + newDogAge +1; }




}















//    Создайте собаку,
//    заставьте её подать голос,
//    заставте её отпраздновать день рождение,
//        заставьте её подать голос снова и убедитесь в том,
//        что её возраст увеличился на 1.