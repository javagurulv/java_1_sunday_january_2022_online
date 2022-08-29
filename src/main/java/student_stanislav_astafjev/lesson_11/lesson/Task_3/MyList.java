package student_stanislav_astafjev.lesson_11.lesson.Task_3;

interface MyList {
    boolean addElementToTheList(Object element);
/*
    Добавляет указанный элемент в конец этого списка.
    В массиве это невозможно сделать, потому что длина массива
    фиксирована.

 */



    boolean removeFirstOccurrenceElementFromTheList(Object element);
/*
    Удаляет элемент из списка, если он присутствует.
    В массиве это невозможно, длина фиксирована.

 */
}
