package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Book ID: ");
        Long bookId = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(bookId);
        System.out.println(bookOpt);

    }
}
