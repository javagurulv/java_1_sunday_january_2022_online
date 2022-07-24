package student_stanislav_astafjev.lesson_9.Task_14;

class Square extends Shape {
    private double sideLenght;
    public Square(String title, double sideLenght) {
        super(title);
        this.sideLenght = sideLenght;
    }
    @Override
    double calculateArea() {
        return sideLenght * sideLenght;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (sideLenght + sideLenght);
    }
}
