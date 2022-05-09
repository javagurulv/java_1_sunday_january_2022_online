package student_sergei_klunkov.lesson_9.level_4.task_14_to_task_29;

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
        double randomSideA = random.nextDouble(10);
        double randomSideB = random.nextDouble(10);
        return new Rectangle("New Rectangle", randomSideA, randomSideB);

    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double randomBaseSideOfTriangle = random.nextDouble(10);
        double randomSecondSideOfTriangle = random.nextDouble(10);
        double randomThirdSideOfTriangle = random.nextDouble(10);
        double randomHeightOfTriangle = random.nextDouble(10);
        return new Triangle("New Triangle", randomBaseSideOfTriangle, randomSecondSideOfTriangle, randomThirdSideOfTriangle, randomHeightOfTriangle);

    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
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

        double sumOfShapePerimeteres = 0;

        for (Shape perimeterOfShape : shapes) {
            sumOfShapePerimeteres += perimeterOfShape.calculatePerimeter();
        }
        return sumOfShapePerimeteres;

    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();

    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();

    }
}
