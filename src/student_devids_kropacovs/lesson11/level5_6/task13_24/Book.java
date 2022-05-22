package student_devids_kropacovs.lesson11.level5_6.task13_24;

import java.util.Objects;

class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public String toString() {
        return "Book: " +
                 bookTitle +
                " [Author: " + bookAuthor + "]" ;
    }
}
