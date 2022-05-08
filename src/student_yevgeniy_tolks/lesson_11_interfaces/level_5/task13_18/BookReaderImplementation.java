package student_yevgeniy_tolks.lesson_11_interfaces.level_5.task13_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookReaderImplementation implements BookReader {

    private final List<Book> books = new ArrayList<>();
    private String[] array;

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

    @Override
    public boolean searchForBook(Book book) {
        boolean bookFound = false;
        if (add(book)) {
            for (Book bookSearch : books) {
                bookFound = bookSearch.equals(book);
                break;
            }
        }
        return bookFound;
    }

    public boolean deleteBook(Book book) {
        if (searchForBook(book)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] provideListOfBooksToUser(List<Book> listOfBooks) {
        array = new String[listOfBooks.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = listOfBooks.get(i).toString();
        }
        return array;
    }

    public void printListOfBooks() {
        System.out.println(books.size());
    }
}
