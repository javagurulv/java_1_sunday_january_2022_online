package student_sergei_klunkov.lesson_11.level_5;

import java.util.List;

interface BookReader {

    boolean searchSameBooksInElectronicReader(Book book, List<Book> books);
    boolean addBookToElectronicReader(Book book, List<Book> books);

    boolean isAuthorAndTitlePresent(Book book, List<Book> books);

}
