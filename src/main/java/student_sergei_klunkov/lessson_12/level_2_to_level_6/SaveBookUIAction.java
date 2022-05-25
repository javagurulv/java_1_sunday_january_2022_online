package student_sergei_klunkov.lessson_12.level_2_to_level_6;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Author: ");
        String author = scanner.nextLine();
        System.out.println(" Enter Title: ");
        String title = scanner.nextLine();

        Book book = new Book(author, title);
        bookDatabase.save(book);
    }
}
