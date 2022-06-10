package student_devids_kropacovs.lesson13.level3;

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
/*
The result is:
1. Got the Test Exception
   Inside finally block

 */
