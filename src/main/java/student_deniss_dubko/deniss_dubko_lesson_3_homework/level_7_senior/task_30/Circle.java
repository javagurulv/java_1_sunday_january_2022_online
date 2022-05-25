package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_30;

class Circle {

    double circleRadius;

    public Circle (double circleRadius) {

        this.circleRadius = circleRadius;
    }

    public String showOnConsoleRadiusIs() {

        return "Radius is: " + this.circleRadius;
    }

    public String calculateCircleArea() {

        double circleArea = Math.PI * circleRadius * circleRadius;

        return "Area is: " + circleArea;
    }


}
