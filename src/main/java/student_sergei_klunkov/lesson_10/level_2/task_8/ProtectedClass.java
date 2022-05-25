package student_sergei_klunkov.lesson_10.level_2.task_8;

 class ProtectedClass {

    private String title;
    private String author;

}

// Модификатор protected доступен только для методов и полей. Благодаря этому будут видны:
//  пределы всех классов, находящихся в том же пакете, что и наш;
//  пределы всех классов-наследников нашего класса.