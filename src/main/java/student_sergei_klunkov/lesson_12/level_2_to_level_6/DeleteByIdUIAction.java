package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Book ID to delete a book: ");
        Long bookId = scanner.nextLong();
        boolean bookDeleteById = bookDatabase.delete(bookId);
        System.out.println(bookDeleteById);

    }




}
