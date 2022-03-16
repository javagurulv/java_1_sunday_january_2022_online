package student_devids_kropacovs.lesson_4.level_4;

 class CalculatorDemo {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int sum;
        int sub;
        int mult;
        double div;
        sum = c.sum(6,2);
        sub = c.sub(6,2);
        div = c.div(6,2);
        mult = c.mult(6,2);

        System.out.println("Sum is " + sum + ", Sub is " + sub + ", div is " + div + ", mult is " + mult);
    }
}
