package student_sergei_klunkov.lessson_12.level_2_to_level_6;

class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDataBase;

    public CountAllBooksUIAction(BookDatabase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {

        int booksAmountInLibrary = bookDataBase.countAllBooks();
        System.out.println("Books amount in library  - " + booksAmountInLibrary);
    }
}
