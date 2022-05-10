package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;

import java.util.List;

interface BookReader {

    boolean searchForDuplicate(Book book, List<Book> books);

    boolean add(Book book, List<Book> books);

    boolean isAuthorAndTitlePresent(Book book, List<Book> books);

    boolean searchForBook(Book book, List<Book> books);

    boolean deleteBook(Book book, List<Book> books);

    String[] provideListOfBooks(List<Book> listOfBooks);

    List<Book> searchBooksByAuthor(String author, List<Book> books);

    List<Book> searchBooksByAuthorV2(String author, List<Book> books);


}