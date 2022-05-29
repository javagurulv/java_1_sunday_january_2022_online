package student_devids_kropacovs.lesson12.level2_7;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
