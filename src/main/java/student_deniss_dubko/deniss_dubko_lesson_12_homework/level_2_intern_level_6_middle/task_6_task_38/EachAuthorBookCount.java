package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

public class EachAuthorBookCount implements UIAction {

    private BookDatabase bookDatabase;

    public EachAuthorBookCount(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }

}