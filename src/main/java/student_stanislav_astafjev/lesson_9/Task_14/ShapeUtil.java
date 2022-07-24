package student_stanislav_astafjev.lesson_9.Task_14;

import java.util.Random;

class ShapeUtil {
     Circle createRandomCircle() {
        Random random = new Random();
        double randomRadius = random.nextDouble(10);
        return new Circle("New Circle", randomRadius);
    }
    Square createRandomSquare() {
        Random random = new Random();
        double randomSideLength = random.nextDouble(10);
        return new Square("New Square", randomSideLength);
    }
    Rectangle createRandomRectangle() {
        Random random = new Random();
        double randomSideA = random.nextInt(10);
        double randomSideB = random.nextInt(10);
        return new Rectangle("New Rectangle", randomSideA, randomSideB);
    }
    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideALength = random.nextDouble(20);
        double sideBLength = random.nextDouble(20);
        double baseLength = random.nextDouble(20);
        double perpendicularHeight = random.nextDouble(20);
        return new Triangle("New Triangle", perpendicularHeight,
                baseLength,
                sideALength,
                sideBLength);
    }
    Shape createRandomShape() {
        Random random = new Random();
        double randomNumber = random.nextDouble(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }
    double calculateArea(Shape[] shapes) {

        double sumOfShapeAreas = 0;

        for (Shape areaOfShape : shapes) {
            sumOfShapeAreas += areaOfShape.calculateArea();
        }
        return sumOfShapeAreas;
    }
    double calculatePerimeter(Shape[] shapes) {

        double sumOfShapePerimeters = 0;

        for (Shape areaOfShape : shapes) {
            sumOfShapePerimeters += areaOfShape.calculatePerimeter();
        }
        return sumOfShapePerimeters;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();

    }
}
