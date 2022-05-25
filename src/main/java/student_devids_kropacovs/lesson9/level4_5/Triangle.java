package student_devids_kropacovs.lesson9.level4_5;

class Triangle extends Shape{

    private double sideLength;

    Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {

        return sideLength * ((sideLength * sideLength - ((sideLength/2) * (sideLength/2))) / 2);
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }
}
