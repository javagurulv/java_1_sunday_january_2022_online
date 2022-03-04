package student_devids_kropacovs.lesson3.level_7.task_30;

class Circle {
    double radius;
    double area;

    double calculateArea(){
        this.area = this.radius * this.radius * 3.14;
        System.out.println("Are of the circle is "+ this.area);
        return this.area;
    }
    public Circle(double radius){
        this.radius = radius;
    }
}
