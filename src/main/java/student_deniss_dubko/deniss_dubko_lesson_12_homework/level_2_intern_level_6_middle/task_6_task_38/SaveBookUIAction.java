package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        Book book = new Book(title, author);
        bookDatabase.save(book);
    }

}