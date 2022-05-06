package student_sergei_klunkov.lesson_9.level_4.task_14;

class Triangle extends Shape {

    private double baseSideOfTriangle;
    private double secondSideOfTriangle;
    private double thirdSideOfTriangle;
    private double heightOfTriangle;

    Triangle(String title, double baseSideOfTriangle, double secondSideOfTriangle, double thirdSideOfTriangle, double heightOfTriangle){
        super(title);
        this.baseSideOfTriangle = baseSideOfTriangle;
        this.secondSideOfTriangle = secondSideOfTriangle;
        this.thirdSideOfTriangle = thirdSideOfTriangle;
        this.heightOfTriangle = heightOfTriangle;

    }

    @Override
    double calculatePerimeter() {
        return (baseSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle);
    }

    @Override
    double calculateArea() {
        return (baseSideOfTriangle * heightOfTriangle)/2;
    }
}
