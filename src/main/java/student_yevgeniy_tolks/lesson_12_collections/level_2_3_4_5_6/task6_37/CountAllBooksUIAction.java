package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

import java.util.Scanner;

class CountAllBooksUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public CountAllBooksUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {

        int booksAmountInLibrary = bookDataBase.countAllBooks();
        System.out.println("Books amount in library  - " + booksAmountInLibrary);
    }
}
