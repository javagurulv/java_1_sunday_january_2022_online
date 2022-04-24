package student_yevgeniy_tolks.lesson_9.level_4_5.task_14_27;

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
            System.out.println("Calculate circle area - TEST OK");
        } else {
            System.out.println("Calculate circle area - TEST FAILED");
        }
    }
        public void calculateCirclePerimeterTest () {

            double circleRadius = 4.0;
            double expectedCirclePerimeter = 25.132741228718345;

            Shape circle = new Circle("Circle", circleRadius);
            double resultOfCirclePerimeter = circle.calculatePerimeter();
            if (expectedCirclePerimeter == resultOfCirclePerimeter) {
                System.out.println("Calculate circle perimeter - TEST OK");
            } else {
                System.out.println("Calculate circle Perimeter - TEST FAILED");
            }
        }
    }
