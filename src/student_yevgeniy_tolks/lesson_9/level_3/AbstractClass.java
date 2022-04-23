package student_yevgeniy_tolks.lesson_9.level_3;

abstract class AbstractClass {
/*
1. Abstract class is a class which cannot be instantiated,in other words can not be created an instance(-es) of
any abstract classes
1.1. If at least 1 method in the class is declared as abstract, the whole class must be abstract
1.2. Abstract methods do not have body (no implementation), only method signature follow by semicolon.
1.3. Abstract class can have a mixture of abstract and non-abstract classes with a body
1.4. Child classes (subclasses) MUST implement(override) all abstract class (superclass) methods.

2. No, abstract class cannot be instantiated
 */

public abstract void abstractClassMethod();

}
