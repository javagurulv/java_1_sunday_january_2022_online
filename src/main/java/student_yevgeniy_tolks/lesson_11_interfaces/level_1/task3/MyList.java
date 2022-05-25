package student_yevgeniy_tolks.lesson_11_interfaces.level_1.task3;

interface MyList {

    boolean addElementToTheList(Object element);
    /*
    Appends the specified element to the end of this list.
    In array, it is not possible to do, cause array length
    is fixed.

     */

    boolean removeFirstOccurrenceElementFromTheList(Object element);
    /*
    Removes the element from the list, if it is present.
    In array, it is not feasible, length is fixed.
     */
}
