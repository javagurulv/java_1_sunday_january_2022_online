package student_devids_kropacovs.lesson9.level7.task31;

import java.util.List;

public class User {

    private String userName;
    private int userID;
    private List<Book> takenBook;

    public User(String userName, int userUniqueID) {

        this.userName = userName;
        this.userID = userUniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public void takeBook(Book book){
        this.takenBook.add(book);
    }

    public void returnBook(Book book){
        this.takenBook.remove(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userID=" + userID ;
    }
}
