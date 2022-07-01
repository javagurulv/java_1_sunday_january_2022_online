package student_devids_kropacovs.lesson16.level2;

class QuadraticEq {

    public void calculateRootsForQuadraticEquation(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b ,c);
        if (discriminant > 0) {
            double x1, x2;
            discriminantGreaterThanZero(a,b,discriminant);
        }
        else if (discriminant == 0) {
            discriminantEqualsZero(a,b);
        }
        else {
            discriminantLessThanZero();
        }
    }

    private double calculateDiscriminant(double a, double b, double c){
        return b * b - 4 * a * c;
    }

    private void discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    private void discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    private void discriminantLessThanZero() {
        System.out.println("Equation has no roots");
    }
}
