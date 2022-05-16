package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4_5.task6_29;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction{
    private BookDataBase bookDataBase;

    public FindByTitleUIAction(BookDataBase bookDataBase) {
        this.bookDataBase = bookDataBase;
    }

    @Override
    public void execute() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter title to search");
        String title = scanner.nextLine().toLowerCase(Locale.ROOT);

        List<Book> bookFindByTitle = bookDataBase.findByTitle(title);
        System.out.println(bookFindByTitle);
    }
}
