package student_devids_kropacovs.lesson12.level2_7;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction{


    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter Title of book to find all books with that tile: ");
        String bookID = scanner.next();
        List<Book> bookOpt = bookDatabase.findByTitle(bookID);
        if(bookOpt.isEmpty()){
            System.out.println("There no book with that Title");
        }else{
            System.out.println(bookOpt.toString());
        }
    }
}
