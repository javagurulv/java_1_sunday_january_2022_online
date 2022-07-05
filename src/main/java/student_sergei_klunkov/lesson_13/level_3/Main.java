package student_sergei_klunkov.lesson_13.level_3;


class Main {

    public static void main(String [] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println(" --- Test Exception --- ");
        } finally {
            System.out.println(" --- Finally block --- ");
        }
    }

}
