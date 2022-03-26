package student_aleksandrs_padalko.lesson_4.level_5;


public class LightColorDetectorTest {  public static void main(String[] args) {
    LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

    lightColorDetectorTest.violetColorTest();
    lightColorDetectorTest.blueColorTest();
    lightColorDetectorTest.greenColorTest();
    lightColorDetectorTest.yellowColorTestColorTest();
    lightColorDetectorTest.orangeColorTestColorTest();
    lightColorDetectorTest.redColorTestColorTest();
    lightColorDetectorTest.allColorTestColorTest();

}

    public void violetColorTest() {
        int waveLength = 388;
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        int realResult = waveLength;
        if (realResult >= 380 && realResult <= 449)   {
            System.out.println("Violet Color = OK");
        }
        else  {
            System.out.println("Violet Color = FAIL");
        }
    }

    public void blueColorTest() {
        int waveLength = 455;
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        int realResult = waveLength;
        if (realResult >= 450 && realResult <= 494) {
            System.out.println("Blue Color = OK");
        } else {
            System.out.println("Blue Color = FAIL");
        }
    }

        public void greenColorTest() {
            int waveLength = 500;
            LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
            int realResult = waveLength;
            if (realResult >= 495 && realResult <= 569)   {
                System.out.println("Green Color = OK");
            }
            else  {
                System.out.println("Green = FAIL");
            }
}
    public void yellowColorTestColorTest() {
        int waveLength = 588;
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        int realResult = waveLength;
        if (realResult >= 570 && realResult <= 589)   {
            System.out.println("Yellow Color = OK");
        }
        else  {
            System.out.println("Yellow = FAIL");
        }}

        public void orangeColorTestColorTest() {
            int waveLength = 590;
            LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
            int realResult = waveLength;
            if (realResult >= 590 && realResult <= 619)   {
                System.out.println("Orange Color = OK");
            }
            else  {
                System.out.println("Orange = FAIL");
            }}

            public void redColorTestColorTest() {
                int waveLength = 622;
                LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
                int realResult = waveLength;
                if (realResult >= 620 && realResult <= 750)   {
                    System.out.println("Red Color = OK");
                }
                else  {
                    System.out.println("Red = FAIL");
                }}

    public void allColorTestColorTest() {
        int waveLength = 388;
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        int realResult = waveLength;
        if (realResult >= 380 && realResult <= 449)   {
            System.out.println("Violet Color = OK");
        }
         else if (realResult >= 450 && realResult <= 494)
        {
            System.out.println("Blue Color = OK");}


         else if (realResult >= 495 && realResult <= 569) {
            System.out.println("Green Color = ok");
        }

        else if (realResult >= 570 && realResult <= 589) {
            System.out.println("Yellow color = ok");
        }
        else if (realResult >= 590 && realResult <= 619) {
            System.out.println("Orange color = ok");
        }
        else if (realResult >= 620 && realResult <= 750) {
            System.out.println("Red color = ok");
        }
        else {
            System.out.println("Invisible light = ok");
        }

}}

