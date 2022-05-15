package student_devids_kropacovs.lesson9.level7.task31;

public class Book {

    private String bookName;
    private String bookAuthor;
    private int uniqueID;

    public Book(String bookName, String bookAuthor, int uniqueBookID) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.uniqueID = uniqueBookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getUniqueID() {
        return uniqueID;
    }
}
