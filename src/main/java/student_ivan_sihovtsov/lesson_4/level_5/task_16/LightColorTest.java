package student_ivan_sihovtsov.lesson_4.level_5.task_16;

public class LightColorTest {

    public static void main(String[] args) {
        LightColorTest lightColorTest = new LightColorTest();
        lightColorTest.test1();
        lightColorTest.test2();
        lightColorTest.test3();
        lightColorTest.test4();
        lightColorTest.test5();
        lightColorTest.test6();
    }

    //380 ... 449 - Фиолетовый ("Violet")
    //450 ... 494 - Синий ("Blue")
    //495 ... 569 - Зеленый ("Green")
    //570 ... 589 - Желтый ("Yellow")
    //590 ... 619 - Оранжевый ("Orange")
    //620 ... 750 - Красный ("Red")


    public void test1() {
        LightColor subject = new LightColor();
        int waveLength = 381;
        String exResult = "Violet";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Violet");
    }

    public void test2() {
        LightColor subject = new LightColor();
        int waveLength = 451;
        String exResult = "Blue";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Blue");
    }

    public void test3() {
        LightColor subject = new LightColor();
        int waveLength = 496;
        String exResult = "Green";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Green");
    }

    public void test4() {
        LightColor subject = new LightColor();
        int waveLength = 571;
        String exResult = "Yellow";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Yellow");
    }

    public void test5() {
        LightColor subject = new LightColor();
        int waveLength = 591;
        String exResult = "Orange";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Orange");
    }

    public void test6() {
        LightColor subject = new LightColor();
        int waveLength = 621;
        String exResult = "Red";
        String aResult = subject.detect(waveLength);
        check(exResult, aResult, "Red");
    }

    public void check(String exResult, String aResult, String name) {
        if (exResult == aResult) {
            System.out.println(name + " is passed!");
        }else {
            System.out.println(name + " is failed");
        }
    }




}
