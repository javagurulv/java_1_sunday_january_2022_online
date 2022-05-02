package student_devids_kropacovs.lesson9.level4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract  double calculatePerimeter();
}
