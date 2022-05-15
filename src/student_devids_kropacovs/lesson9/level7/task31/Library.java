package student_devids_kropacovs.lesson9.level7.task31;

import java.util.List;

public class Library {

    private List<Book> bookList;
    private List<Book> reservedBooks;
    private List<Book> takenBooks;
    private List<User> userList;

    public Library() {

    }

    public boolean searchForBook (Book book){
        for(Book bookForSearch : bookList){
            if(bookForSearch.equals(book)){
                return true;
            }
        }
        return false;
    }

    public void takeBook(Book book, User user){
        if(searchForBook(book)) {
            user.takeBook(book);
            this.takenBooks.add(book);
            bookList.remove(book);
        }else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(Book book, User user){

        user.returnBook(book);
        this.takenBooks.remove(book);
        bookList.add(book);
    }

    public void reserveBook(Book book, User user){
        if(searchForBook(book)) {
            this.reservedBooks.add(book);
            bookList.remove(book);
        }else {
            System.out.println("Book not found");
        }
    }

    public void addNewBook(Book book){
        this.bookList.add(book);
    }

    public void sendEmailToRemindReturnDeadline(User user){
        System.out.println("Email has been sent to " + user.toString());
    }

    public void sendInvoiceForDeadlineFail(User user){
        System.out.println("Email has been sent to " + user.toString());
    }


    @Override
    public String toString() {
        return "Library{}";
    }
}
