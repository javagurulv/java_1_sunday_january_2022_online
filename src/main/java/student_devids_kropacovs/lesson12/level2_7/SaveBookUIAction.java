package student_devids_kropacovs.lesson12.level2_7;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter author's name: ");
        String authorsName = scanner.next();
        System.out.println("Please, enter Book's Title: ");
        String bookTitle = scanner.next();
        System.out.println("Please, enter Book's Year of issue: ");
        String yearOfIssue = scanner.next();
        Book book = new Book(authorsName, bookTitle);
        book.setYearOfIssue(yearOfIssue);
        bookDatabase.save(book);
    }

}
