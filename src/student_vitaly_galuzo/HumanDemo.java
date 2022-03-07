package student_vitaly_galuzo;

public class HumanDemo {

    public static void main(String[] args) {


        Human human = new Human("Olga",29,60);
        String humanName = human.getName();
        int humanAge = human.getAge();
        int humanWeight = human.getWeight();

        System.out.println("Human Name is: "+ humanName);
        System.out.println(humanName+" "+"is:"+" "+humanAge);
        System.out.println(humanName+"'"+"s"+" "+"weight"+" "+"is:"+" "+humanWeight);

    }













}
