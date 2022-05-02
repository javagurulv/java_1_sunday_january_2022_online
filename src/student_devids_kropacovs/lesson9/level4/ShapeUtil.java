package student_devids_kropacovs.lesson9.level4;

import java.util.Random;

public class ShapeUtil {

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
}
