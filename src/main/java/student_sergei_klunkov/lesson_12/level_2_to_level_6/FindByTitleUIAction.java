package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Title to search: ");
        String title = scanner.nextLine().toLowerCase(Locale.ROOT);

        List<Book> findBookByTitle = bookDatabase.findByAuthor(title);
        System.out.println(findBookByTitle);

    }
}
