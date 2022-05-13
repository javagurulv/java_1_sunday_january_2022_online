package student_yevgeniy_tolks.lesson_12_collections.level_2.task6_9;

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

}
