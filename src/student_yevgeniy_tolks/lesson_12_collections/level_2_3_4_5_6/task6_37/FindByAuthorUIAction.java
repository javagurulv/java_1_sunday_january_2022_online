package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5_6.task6_37;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction{
    private BookDataBase bookDataBase;

    public FindByAuthorUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter author to search");
        String author = scanner.nextLine();

        List<Book> bookFindByAuthor = bookDataBase.findByAuthor(author);
        System.out.println(bookFindByAuthor);
    }
}
