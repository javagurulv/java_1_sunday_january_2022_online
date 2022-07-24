package student_stanislav_astafjev.lesson_9.Task_14;

abstract class Shape {
    private String title;
    public Shape(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
