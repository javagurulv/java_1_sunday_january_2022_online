package student_devids_kropacovs.lesson9.level4;

class Rectangle extends Shape{

    private double sideX;
    private double sideY;

    Rectangle(String title, double sideX, double sideY) {
        super(title);
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    double calculateArea() {
        return sideY * sideX;
    }

    @Override
    double calculatePerimeter() {
        return sideY * 2 + sideX * 2;
    }
}
