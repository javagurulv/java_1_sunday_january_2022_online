package student_yevgeniy_tolks.lesson_11_interfaces.level_5_6.task13_24;

import java.util.List;

interface BookReader {

    boolean searchForDuplicate(Book book, List<Book> books);

    boolean add(Book book, List<Book> books);

    boolean isAuthorAndTitlePresent(Book book, List<Book> books);

    boolean searchForBook(Book book, List<Book> books);

    boolean deleteBook(Book book, List<Book> books);

    String[] provideListOfBooks(List<Book> listOfBooks);

    List<Book> searchBooksByAuthor(String author, List<Book> books);

    List<Book> searchBooksByAuthorV2(String author, String query, List<Book> books);

    List<Book> searchBooksByTitle(String title, List<Book> books);

    List<Book> searchBooksByTitleV2(String title, String query, List<Book> books);

    BookStatus giveBookStatusRead(Book book, List<Book> books);

    BookStatus giveBookStatusUnRead(Book book, List<Book> books);

    List<Book> provideListOfBooksStatusRead(List<Book> listOfBooks);

    List<Book> provideListOfBooksStatusUnRead(List <Book> listOfBooks);
}