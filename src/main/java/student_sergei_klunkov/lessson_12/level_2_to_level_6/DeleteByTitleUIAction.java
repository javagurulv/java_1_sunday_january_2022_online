package student_sergei_klunkov.lessson_12.level_2_to_level_6;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Book title to delete a book: ");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);

    }
}
