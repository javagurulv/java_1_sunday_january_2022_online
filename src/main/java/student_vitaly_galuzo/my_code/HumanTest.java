package student_vitaly_galuzo.my_code;

public class HumanTest {

    public static void main(String[] args) {
        HumanTest humanTest = new HumanTest();

        humanTest.ageTest();
        humanTest.weightTest();




    }



    public void ageTest() {

        Human human = new Human("Olga",30,60,"Galuzo");

        int expectedResult = 30;
        int actualResult = human.getAge();
        if (expectedResult == actualResult) {
            System.out.println("TEST is OK!");
        } else {
            System.out.println("TEST is FAILED!");
        }
        }

        public void weightTest() {

        Human human = new Human("Olga",30,55,"Galuzo");

        int expectedResult = 55;
        int actualResult = human.weight;
        if ( expectedResult == actualResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
        }



}
