package student_sergei_klunkov.lesson_9.level_4_to_5.task_14_to_29;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(" Perimeter of random Circle = " + circlePerimeter);
        System.out.println(" Area of random Circle = " + circleArea);


        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println(" Perimeter of random Square = " + squarePerimeter);
        System.out.println(" Area of random Square = " + squareArea);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println(" Perimeter of random Rectangle = " + rectanglePerimeter);
        System.out.println(" Area of random Rectangle = " + rectangleArea);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println(" Perimeter of random Triangle = " + trianglePerimeter);
        System.out.println(" Area of random Triangle = " + triangleArea);

    }
}
