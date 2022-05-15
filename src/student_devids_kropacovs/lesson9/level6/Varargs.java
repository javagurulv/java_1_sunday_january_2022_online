package student_devids_kropacovs.lesson9.level6;

public class Varargs {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        int ex1 = varargs.sumOfManyNumbers(1,2,3);
        int ex2 = varargs.sumOfManyNumbers(1,2,3,4,5);
        int ex3 = varargs.sumOfManyNumbers(1,2,3,4,5,6,7);
        System.out.println("ex1 = " + ex1 + " ex2 = " + ex2 + " ex3 = " + ex3);
    }

    public int sumOfManyNumbers (int ... args){
        int sum = 0;
        for(int x : args){
            sum += x;
        }
        return  sum;
    }
}
