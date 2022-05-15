package student_devids_kropacovs.lesson9.level4_5;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.squareAreaTest();
        rectangleTest.squarePerimeterTest();
    }

    public void squareAreaTest(){
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        double expectedResult = 24;
        if (expectedResult == rectangle.calculateArea()){
            System.out.println("Rectangle area test PASS");
        }else{
            System.out.println("Rectangle Area test FAIL");
        }
    }

    public void squarePerimeterTest(){
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        double expectedResult = 20;
        if (expectedResult == rectangle.calculatePerimeter()){
            System.out.println("Rectangle perimeter test PASS");
        }else{
            System.out.println("Rectangle perimeter test FAIL");
        }
    }
}
