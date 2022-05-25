package student_devids_kropacovs.lesson11.level5_6.task13_24;

import java.util.List;

interface BookReader {
    boolean addBookToLibrary(Book book);
    void showBookList();
    List<Book> findBookByAuthor(String authorName);
    List<Book> findBookByPartOfTheAuthorName(String authorName);
    List<Book> findBookByBookName(String bookName);
    List<Book> findBookByPartOfBookName(String bookName);
    boolean markBookAsRead(Book book);
}
