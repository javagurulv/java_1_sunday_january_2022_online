package student_yevgeniy_tolks.lesson_3.level_7;

//Task 30 - Blueprint of class Circle;
 class Circle {
       double radius;

    double calculateArea(double radius){
        this.radius=radius;
        double area=Math.PI*radius*radius;
        return area;
    }
}
