package student_devids_kropacovs.lesson9.level4;

class SquareTest {

    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();
        squareTest.squareAreaTest();
        squareTest.squarePerimeterTest();
    }

    public void squareAreaTest(){
        Square square = new Square("Square", 6);
        double expectedResult = 6 * 6;
        if (expectedResult == square.calculateArea()){
            System.out.println("Square area test PASS");
        }else{
            System.out.println("Square Area test FAIL");
        }
    }

    public void squarePerimeterTest(){
        Square square = new Square("Square", 6);
        double expectedResult = 6 * 4;
        if (expectedResult == square.calculatePerimeter()){
            System.out.println("Square perimeter test PASS");
        }else{
            System.out.println("Square perimeter test FAIL");
        }
    }
}
