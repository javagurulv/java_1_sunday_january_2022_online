package student_devids_kropacovs.lesson12.level2_7;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter Author's name to find all books: ");
        String bookID = scanner.next();
        List<Book> bookOpt = bookDatabase.findByAuthor(bookID);
        if(bookOpt.isEmpty()){
            System.out.println("There no book with that Author");
        }else{
            System.out.println(bookOpt.toString());
        }
    }
}
