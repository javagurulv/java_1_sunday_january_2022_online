package student_yevgeniy_tolks.lesson_13_exceptions.level_2.task_7_17;

public class AccessDeniedException extends Exception {
    // declared AccessDeniedException class is a checked exception,compiler does require
    // methods to catch;

    // RuntimeException is a class including subclasses, which once are unchecked exceptions;

    //unchecked exceptions are not checked at compile-time which means that the
    // compiler doesn't require methods to catch or to specify (with a throws) them.

    //JT - preferably to extend custom classes like AccessDeniedException from Exception class
}
