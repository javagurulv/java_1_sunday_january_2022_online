package student_yevgeniy_tolks.lesson_9.level_4.task_14_19;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateSquareAreaTest();
        test.calculateSquarePerimeterTest();
    }

    public void calculateSquareAreaTest() {
        double squareSideLength = 3;
        double expectedSquareArea = 9;

        Shape square = new Square("Square", squareSideLength);
        double resultOfSquareArea = square.calculateArea();

        if (expectedSquareArea == resultOfSquareArea) {
            System.out.println("Calculate square area - TEST OK");
        } else {
            System.out.println("Calculate square area - TEST  FAILED");
        }
    }

    public void calculateSquarePerimeterTest() {
        double squareSideLength = 3;
        double expectedSquarePerimeter = 12;

        Shape square = new Square("Square", squareSideLength);
        double resultOfSquarePerimeter = square.calculatePerimeter();

        if (expectedSquarePerimeter == resultOfSquarePerimeter) {
            System.out.println("Calculate square perimeter - TEST OK");
        } else {
            System.out.println("Calculate square perimeter - TEST  FAILED");
        }

    }
}
