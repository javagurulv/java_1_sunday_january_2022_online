package student_anna_zhoydik.lesson_4.task_16;

public class LightColorDetectorTest {
  public static void main(String[] args) {
    LightColorDetectorTest lightColorDetectortest = new LightColorDetectorTest();
    lightColorDetectortest.detectTest();
    lightColorDetectortest.detectTest2();
    lightColorDetectortest.detectTest3();
    lightColorDetectortest.detectTest4();
    lightColorDetectortest.detectTest5();
    lightColorDetectortest.detectTest6();
    lightColorDetectortest.detectTest7();

  }

  public void detectTest() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Violet";
    String ExpResult = lightColorDetector.detect(381);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }

  public void detectTest2() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Blue";
    String ExpResult = lightColorDetector.detect(451);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }
  public void detectTest3() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Green";
    String ExpResult = lightColorDetector.detect(496);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }
  public void detectTest4() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Red";
    String ExpResult = lightColorDetector.detect(621);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }
  public void detectTest5() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Yellow";
    String ExpResult = lightColorDetector.detect(571);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }
  public void detectTest6() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Orange";
    String ExpResult = lightColorDetector.detect(591);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }
  public void detectTest7() {
    LightColorDetector lightColorDetector = new LightColorDetector();
    String Result = "Invisible";
    String ExpResult = lightColorDetector.detect(1000);
    if (Result == ExpResult) {
      System.out.println("Test is OK");
    } else {
      System.out.println("Test is Fail");
    }

  }

}
