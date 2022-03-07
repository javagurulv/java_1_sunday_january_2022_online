package student_vitaly_galuzo;

public class Dog {


    String nickName;
    int age;



    public Dog(String nickName,int age){
        this.nickName = nickName;
        this.age = age;



    }
    public void dogVoice(){
        System.out.println("Woof Woof Woof");

    }
    public void dogNickName(){
        System.out.println("Argo");
    }

    public int getAge(){
        return this.age;
    }







}
