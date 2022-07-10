package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.List;
import java.util.Scanner;

class SearchByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SearchByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author to search: ");
        String author = scanner.nextLine();

        List<Book> bookSearchByAuthor = bookDatabase.searchByAuthor(author);
        System.out.println(bookSearchByAuthor);
    }

}