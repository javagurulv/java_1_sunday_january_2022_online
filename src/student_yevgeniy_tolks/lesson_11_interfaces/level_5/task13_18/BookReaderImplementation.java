package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImplementation implements BookReader {

    private final List<Book> books = new ArrayList<>();

    @Override
    public boolean searchForDuplicate(Book book) {
        boolean duplicateSearch = false;
        for (Book bookSearch : books) {
            duplicateSearch = bookSearch.equals(book);
            break;
        }
        return duplicateSearch;
    }

    @Override
    public boolean add(Book book) {
        boolean foundBook = false;
        if (!searchForDuplicate(book) && isAuthorAndTitlePresent(book)) {
            books.add(book);
            foundBook = true;
        }
        return foundBook;
    }

    @Override
    public boolean isAuthorAndTitlePresent(Book book) {
        return book.getAuthor() != null && book.getTitle() != null;
    }

    public void printListOfBooks() {
        System.out.println(books.size());

    }
}
