package student_yevgeniy_tolks.lesson_13_exceptions.level_3.task21;

class Main {
    public static void main(String [] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

// ANSWER
// Got the Test Exception
// Inside finally block