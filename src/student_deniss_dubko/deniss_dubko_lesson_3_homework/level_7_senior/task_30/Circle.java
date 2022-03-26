package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_7_senior.task_30;

class Circle {

    double circleRadius;

    public Circle (double circleRadius) {

        this.circleRadius = circleRadius;
    }

    public void calculateCircleArea() {

        double area = Math.PI * circleRadius * circleRadius;

        System.out.println("Radius is = " + this.circleRadius);
        System.out.println("Area is = " + area);
    }


}
