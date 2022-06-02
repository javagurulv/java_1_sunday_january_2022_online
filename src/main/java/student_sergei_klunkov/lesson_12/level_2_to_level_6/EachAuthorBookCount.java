package student_sergei_klunkov.lesson_12.level_2_to_level_6;


class EachAuthorBookCount implements UIAction {

    private BookDatabase bookDataBase;

    public EachAuthorBookCount(BookDatabase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        System.out.println(bookDataBase.getEachAuthorBookCount());
    }
}
