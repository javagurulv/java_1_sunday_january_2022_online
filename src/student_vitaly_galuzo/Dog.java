package student_vitaly_galuzo;

public class Dog {


    String nickName;
    int age;
    String color;



    public Dog(String nickName,int age,String color){
        this.nickName = nickName;
        this.age = age;
        this.color = color;



    }
    public void dogVoice(){
        System.out.println("Woof Woof Woof "+"my color is "+ this.color);

    }
    public void dogNickName(){
        System.out.println("Argo");
    }

    public int getAge(){
        return this.age;
    }

    public int happyBirthday(){
        this.age = this.age +1;
        return this.age;
    }
    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("My new color is "+color);


    }

}
