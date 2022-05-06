package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;

interface BookReader {

    boolean searchForDuplicate(Book book);
    boolean add (Book book);
    boolean isAuthorAndTitlePresent(Book book);
    boolean deleteBook(Book book);
}
