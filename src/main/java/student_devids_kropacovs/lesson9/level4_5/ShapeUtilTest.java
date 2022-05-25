package student_devids_kropacovs.lesson9.level4_5;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.calculateCommonPerimeter();
        shapeUtilTest.calculateCommonArea();
    }

    public void calculateCommonPerimeter(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 6);
        shapes[3] = new Triangle("Triangle", 4);

        double expectedResult = 25.12 + 16 + 20 + 12;
        if (shapeUtil.calculatePerimeter(shapes) == expectedResult){
            System.out.println("Common area test pass");
        }else{
            System.out.println("Common area test fail");
        }
    }

    public void calculateCommonArea(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 6);
        shapes[3] = new Triangle("Triangle", 4);

        System.out.println(shapeUtil.calculateArea(shapes));

        double expectedResult = 114.24;
        if (shapeUtil.calculateArea(shapes) == expectedResult){
            System.out.println("Common area test pass");
        }else{
            System.out.println("Common area test fail");
        }
    }

}
