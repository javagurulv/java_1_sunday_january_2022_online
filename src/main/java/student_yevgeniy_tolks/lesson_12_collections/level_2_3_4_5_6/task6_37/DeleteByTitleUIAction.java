package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

import java.util.Locale;
import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction{
    private BookDataBase bookDataBase;

    public DeleteByTitleUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title to delete a book:");
        String title = scanner.nextLine();
        bookDataBase.deleteByTitle(title);
    }
}
