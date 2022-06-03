package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Author to search: ");
        String author = scanner.nextLine();

        List<Book> findBookByAuthor = bookDatabase.findByAuthor(author);
        System.out.println(findBookByAuthor);

    }

}
