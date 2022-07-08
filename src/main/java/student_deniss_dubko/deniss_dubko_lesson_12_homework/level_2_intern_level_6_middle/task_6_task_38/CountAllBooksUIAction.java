package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        int booksAmountInLibrary = bookDatabase.countAllBooks();
        System.out.println("Books in Library: " + booksAmountInLibrary);
    }

}