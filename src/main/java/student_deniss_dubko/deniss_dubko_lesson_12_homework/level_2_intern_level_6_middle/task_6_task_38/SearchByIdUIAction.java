package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.Optional;
import java.util.Scanner;

class SearchByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SearchByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        Long bookID = scanner.nextLong();
        Optional<Book> bookOptional = bookDatabase.searchById(bookID);
        System.out.println(bookOptional);
    }

}