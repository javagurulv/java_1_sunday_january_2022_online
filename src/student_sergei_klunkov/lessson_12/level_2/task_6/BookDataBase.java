package student_sergei_klunkov.lessson_12.level_2.task_6;

public interface BookDataBase {

    Long save(Book book);


    boolean delete(Long bookId);

}
