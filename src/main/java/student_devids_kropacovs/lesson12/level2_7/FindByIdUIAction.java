package student_devids_kropacovs.lesson12.level2_7;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter books ID: ");
        Long bookID = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(bookID);
        if(bookOpt.isEmpty()){
            System.out.println("There no book with that ID");
        }else{
            System.out.println(bookOpt.toString());
        }

    }

}
