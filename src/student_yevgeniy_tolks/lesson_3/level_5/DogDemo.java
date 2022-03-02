package student_yevgeniy_tolks.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {

        Dog dog=new Dog("Aida",10,"black");

        //Task 18 - dogName 3 times printed on console
        String dogVoice=dog.voice();
        for(int i =0;i<3;i++){
            System.out.println(dogVoice);
        }

        //Task 19 - dogName and age printed on console
        int age = dog.dogAge;
        System.out.println();
        System.out.println(dogVoice + " " + age + " years");

        //Task 20 - increase of age by one (celebrating birthday)
        System.out.println();
        System.out.println(dogVoice);
        System.out.println("Celebrating a birthday!");
        System.out.println(dogVoice);
        dog.happyBirthday();

        //Task21 - dogName , age and color to print on console
        System.out.println();
        String colorOfDog=dog.dogColor;
        System.out.println(dogVoice + " " + age + " years " + colorOfDog);

        //Task22 - color change of virtual object
        System.out.println();
        System.out.println(dogVoice);
        System.out.println("change color");
        System.out.println(dogVoice);
        dog.changeColor("white");

    }
}
