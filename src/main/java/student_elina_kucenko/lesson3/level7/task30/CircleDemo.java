package student_elina_kucenko.lesson3.level7.task30;

class CircleDemo {
    public static void main(String[] args) {
        double radius = 5;
        Circle circle = new Circle(radius);
        System.out.println("If circle radius is " + radius +" then Area is "+circle.calculateArea());
    }
}
