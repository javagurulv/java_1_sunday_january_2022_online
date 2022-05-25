package student_sergei_klunkov.lesson_9.level_7.task_31;

import java.util.ArrayList;
import java.util.List;

class Library {

    private List<Reader> readers = new ArrayList<>();
    private List<Book> allBooks = new ArrayList<>();
    private List<Book> presentBooks = new ArrayList<>();
    private List<Book> absentBooks = new ArrayList<>();

    public void addReaderInTheClientsList(Reader reader) {
        this.readers.add(reader);
    }

    public void addNewBookInStock(Book book) {
        this.allBooks.add(book);
    }

    public List<Book> getAllBooks() {
        return this.allBooks;
    }

    public List<Reader> getReaders() {
        return this.readers;
    }

    public List<Book> getPresentBooks() {
        return this.presentBooks;
    }

    public List<Book> getAbsentBooks() {
        return this.absentBooks;
    }

    public void clientTakesBookFromLibrary(Book book) {
        if (book.isBookFoundInLibrary()) {
            this.absentBooks.add(book);
            this.presentBooks.remove(book);
        }
    }

    public void clientReturnBookBackToLibrary(Book book) {
        this.absentBooks.remove(book);
        this.presentBooks.add(book);
    }
}
