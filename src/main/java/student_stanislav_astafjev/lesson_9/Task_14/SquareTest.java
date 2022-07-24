package student_stanislav_astafjev.lesson_9.Task_14;

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
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
    public void calculateSquarePerimeterTest() {
        double squareSideLength = 3;
        double expectedSquarePerimeter = 12;
        Shape square = new Square("Square", squareSideLength);
        double resultOfSquarePerimeter = square.calculatePerimeter();
        if (expectedSquarePerimeter == resultOfSquarePerimeter) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
}
