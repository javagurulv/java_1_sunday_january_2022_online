package student_vitaly_galuzo;

public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Argo",3);


        dog.dogNickName();
        dog.dogNickName();
        dog.dogNickName();
        int dogAgeIs = dog.getAge();
        dog.dogVoice();

        System.out.println("Dog is "+dogAgeIs+" "+"y.o");




    }


}
