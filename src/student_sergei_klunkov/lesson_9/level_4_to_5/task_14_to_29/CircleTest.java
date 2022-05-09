package student_sergei_klunkov.lesson_9.level_4_to_5.task_14_to_29;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculatePerimeterOfCircle();
        test.calculateAreaOfCircle();
    }

    public void calculatePerimeterOfCircle() {

        double radius = 4.0;
        double expectedResult = 25.132741228718345;

        Shape circle = new Circle("Circle", radius);
        double resultOfCirclePerimeter = circle.calculatePerimeter();
        if (expectedResult == resultOfCirclePerimeter) {
            System.out.println(" Circle Perimeter Test " + " - Test passed! ");
        } else {
            System.out.println(" Circle Perimeter Test " + " - Test failed! ");
        }
    }

    public void calculateAreaOfCircle() {

        double radius = 4.0;
        double expectedResult = 50.26548245743669;

        Shape circle = new Circle("Circle", radius);
        double resultOfCircleArea = circle.calculateArea();
        if (resultOfCircleArea == expectedResult) {
            System.out.println(" Circle Area Test " + " - Test passed! ");
        } else {
            System.out.println(" Circle Area Test " + " - Test failed! " );
        }
    }
}

