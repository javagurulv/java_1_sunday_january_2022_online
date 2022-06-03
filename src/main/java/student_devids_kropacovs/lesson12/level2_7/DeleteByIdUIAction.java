package student_devids_kropacovs.lesson12.level2_7;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter Book's ID that you would like to delete: ");
        Long bookID = scanner.nextLong();
        bookDatabase.delete(bookID);
        boolean deleteBook = bookDatabase.delete(bookID);
        if(deleteBook){
            System.out.println("Book has been deleted");
        }else{
            System.out.println("There is not book with that ID");
        }
    }
}
