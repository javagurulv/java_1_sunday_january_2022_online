package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class SearchByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SearchByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title to search: ");
        String title = scanner.nextLine().toLowerCase(Locale.ROOT);

        List<Book> bookSearchByTitle = bookDatabase.searchByTitle(title);
        System.out.println(bookSearchByTitle);
    }

}