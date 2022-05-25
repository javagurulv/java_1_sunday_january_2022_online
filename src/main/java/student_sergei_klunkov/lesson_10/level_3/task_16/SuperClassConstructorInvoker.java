package student_sergei_klunkov.lesson_10.level_3.task_16;

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}

// Call to 'super()' must be first statement in constructor body
