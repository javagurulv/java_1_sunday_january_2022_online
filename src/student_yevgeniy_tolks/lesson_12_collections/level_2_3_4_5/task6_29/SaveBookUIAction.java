package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5.task6_29;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDataBase bookDataBase;

    public SaveBookUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter title:");
        String title = scanner.nextLine();

        Book book = new Book(title,author);
        bookDataBase.save(book);
    }
}
