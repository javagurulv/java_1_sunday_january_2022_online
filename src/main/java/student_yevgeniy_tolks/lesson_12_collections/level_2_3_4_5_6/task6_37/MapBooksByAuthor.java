package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

class MapBooksByAuthor implements UIAction {

    private BookDataBase bookDataBase;

    public MapBooksByAuthor(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        System.out.println(bookDataBase.getAuthorToBooksMap());
    }
}
