package student_deniss_dubko.deniss_dubko_lesson_10_homework.level_3_junior.task_16;

/*
Почему не компилируется код приведённый ниже?
Исправьте ошибку компиляции.

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        super();
        System.out.println(2);
    }
}
*/

public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {

        super();
        System.out.println(1);
        System.out.println(2);
    }

}