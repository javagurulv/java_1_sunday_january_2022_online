package student_devids_kropacovs.lesson9.level4;

import java.util.Random;

class ShapeUtil {

    public Circle createRandomCircle(){
        Random random = new Random();
        double randomRadius = random.nextDouble(10);
        return new Circle("Circle", randomRadius);
    }

    public Square createRandomSquare(){
        Random random = new Random();
        double randomSide = random.nextDouble(10);
        return new Square("Square", randomSide);
    }

    public Rectangle createRandomRectangle(){
        Random random = new Random();
        double randomSideX = random.nextDouble(10);
        double randomSideY = random.nextDouble(10);
        return new Rectangle("Rectangle", randomSideX, randomSideY);

    }

    public Triangle createRandomTriangle(){
        Random random = new Random();
        double randomSide = random.nextDouble(10);
        return new Triangle("Triangle", randomSide);
    }

    double calculatePerimeter(Shape[] shapes){
        double perimeterOfAllFigures = 0;
        for (int i = 0; i < shapes.length; i++){
            perimeterOfAllFigures = shapes[i].calculatePerimeter() + perimeterOfAllFigures;
        }
        return perimeterOfAllFigures;
    }

    double calculateArea(Shape[] shapes){
        double areaOfAllFigures = 0;
        for (int i = 0; i < shapes.length; i++){
            areaOfAllFigures = shapes[i].calculateArea() + areaOfAllFigures;
        }
        return areaOfAllFigures;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
