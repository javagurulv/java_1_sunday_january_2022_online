package student_devids_kropacovs.lesson9.level4_5;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.circleAreaTest();
        circleTest.circlePerimeterTest();
    }

    public void circleAreaTest(){
        Circle circle = new Circle("Circle", 4);
        double expectedResult = 3.14 * 4 * 4;
        if (expectedResult == circle.calculateArea()){
            System.out.println("Circle area test PASS");
        }else{
            System.out.println("Circle Area test FAIL");
        }
     }

    public void circlePerimeterTest(){
        Circle circle = new Circle("Circle", 4);
        double expectedResult = 3.14 * 4 * 2;
        if (expectedResult == circle.calculatePerimeter()){
            System.out.println("Circle perimeter test PASS");
        }else{
            System.out.println("Circle perimeter test FAIL");
        }
    }
}
