package student_devids_kropacovs.lesson12.level2_7;

import java.util.Optional;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);

}
