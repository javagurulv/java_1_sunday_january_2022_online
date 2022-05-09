package student_sergei_klunkov.lesson_9.level_4.task_14_to_task_29;

class Square extends Shape {

    private  double sideLength;

    Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }


    @Override
    double calculateArea() {
        return (sideLength * sideLength);
    }

    @Override
    double calculatePerimeter() {
        return (4 * sideLength);
    }
}
