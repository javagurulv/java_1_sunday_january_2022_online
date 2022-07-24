package student_stanislav_astafjev.lesson_9.Task_14;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateCircleAreaTest();
        test.calculateCirclePerimeterTest();
    }
    public void calculateCircleAreaTest() {
        double circleRadius = 4.0;
        double expectedCircleArea = 50.26548245743669;
        Shape circle = new Circle("Circle", circleRadius);
        double resultOfCircleArea = circle.calculateArea();
        if (expectedCircleArea == resultOfCircleArea) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
    public void calculateCirclePerimeterTest() {
        double circleRadius = 4.0;
        double expectedCirclePerimeter = 25.132741228718345;
        Shape circle = new Circle("Circle", circleRadius);
            double resultOfCirclePerimeter = circle.calculatePerimeter();
            if (expectedCirclePerimeter == resultOfCirclePerimeter) {
                System.out.println("TEST PASS");
            } else {
                System.out.println("TEST FAIL");
            }
        }
    }

