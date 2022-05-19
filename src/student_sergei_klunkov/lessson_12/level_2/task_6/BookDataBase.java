package student_sergei_klunkov.lessson_12.level_2.task_6;

import java.util.List;
import java.util.Optional;

interface BookDataBase {

    Long save(Book book);


    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

}
