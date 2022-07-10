package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> searchById(Long bookId);

    List<Book> searchByAuthor(String author);

    List<Book> searchByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> search(SearchCriteria searchCriteria);

    Set<String> searchUniqueAuthors();

    Set<String> searchUniqueTitles();

    Set<Book> searchUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}