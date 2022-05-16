package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5.task6_29;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction{

    private BookDataBase bookDataBase;

    public FindByIdUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book ID:");
        Long bookID = scanner.nextLong();
        Optional<Book> bookOpt = bookDataBase.findById(bookID);
        System.out.println(bookOpt);
    }
}
