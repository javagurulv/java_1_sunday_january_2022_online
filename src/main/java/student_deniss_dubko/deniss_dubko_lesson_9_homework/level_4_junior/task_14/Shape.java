package student_deniss_dubko.deniss_dubko_lesson_9_homework.level_4_junior.task_14;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}