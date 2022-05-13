package student_yevgeniy_tolks.lesson_12_collections.level_2.task6;

interface BookDataBase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);
}
