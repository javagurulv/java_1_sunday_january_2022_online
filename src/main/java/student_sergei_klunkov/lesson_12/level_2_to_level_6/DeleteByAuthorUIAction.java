package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Books author to delete a book: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);

    }
}
