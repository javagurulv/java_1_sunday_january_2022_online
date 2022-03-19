package student_vitaly_galuzo.my_code;

import student_vitaly_galuzo.my_code.Human;

public class HumanDemo {

    public static void main(String[] args) {


        Human human = new Human("Olga",30,65,"Galuzo");

        String humanName = human.getName("Olga"," Galuzo");
        int age = human.getAge();
        int newAge = human.getNewAge();
        int humanWeight = human.getWeight();
        int humanNewWeight = human.getNewWeight();

        System.out.println("Human Name is: "+ humanName);
        System.out.println(humanName +" "+"is:"+" "+age);
        System.out.println(humanName + " " + "now is" + " " + newAge);
        System.out.println(humanName +"'"+"s"+" "+"weight"+" "+"is:"+" "+humanWeight);
        System.out.println(humanName +"'"+"s"+" "+"new weight"+" "+"is:"+" "+humanNewWeight);


        }

    }














