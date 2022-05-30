package student_devids_kropacovs.lesson12.level2_7;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();

}
