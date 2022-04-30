package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

import java.util.ArrayList;
import java.util.List;

class Library {

    private List<Reader> readers = new ArrayList<>();
    private List<Book> allBooks = new ArrayList<>();
    private List<Book> presentBooks = new ArrayList<>();
    private List<Book> absentBooks = new ArrayList<>();

    public void addReaderInTheList(Reader reader) {
        this.readers.add(reader);
    }

    public void addNewBookInTheList(Book book) {
        this.allBooks.add(book);
    }

    public List<Reader> getReaders() {
        return this.readers;
    }

    public List<Book> getAllBooks() {
        return this.allBooks;
    }

    public List<Book> getPresentBooks() {
        return this.presentBooks;
    }

    public List<Book> getAbsentBooks() {
        return this.absentBooks;
    }

    public void takeABookFromLibrary(Book book) {
        if (book.isBookFoundInLibrary()) {
            this.absentBooks.add(book);
            this.presentBooks.remove(book);
        }
    }

    public void returnBookToLibrary(Book book) {
        this.absentBooks.remove(book);
        this.presentBooks.add(book);
    }
}
