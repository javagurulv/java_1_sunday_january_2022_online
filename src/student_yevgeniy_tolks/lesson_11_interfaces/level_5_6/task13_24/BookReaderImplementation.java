package student_yevgeniy_tolks.lesson_11_interfaces.level_5_6.task13_24;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImplementation implements BookReader {


    @Override
    public boolean searchForDuplicate(Book book, List<Book> books) {
        boolean duplicateSearch = false;
        for (Book bookSearch : books) {
            duplicateSearch = bookSearch.equals(book);
            break;
        }
        return duplicateSearch;
    }

    @Override
    public boolean add(Book book, List<Book> books) {
        boolean foundBook = false;
        if (!searchForDuplicate(book, books) && isAuthorAndTitlePresent(book, books)) {
            books.add(book);
            foundBook = true;
        }
        return foundBook;
    }

    @Override
    public boolean isAuthorAndTitlePresent(Book book, List<Book> books) {
        return book.getAuthor() != null && book.getTitle() != null;
    }

    @Override
    public boolean searchForBook(Book book, List<Book> books) {
        boolean bookFound = false;
        for (Book bookSearch : books) {
            if (bookSearch.equals(book)) {
                bookFound = true;
                break;
            }
        }
        return bookFound;
    }

    @Override
    public boolean deleteBook(Book book, List<Book> books) {
        if (searchForBook(book, books)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] provideListOfBooks(List<Book> listOfBooks) {
        String[] array = new String[listOfBooks.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = listOfBooks.get(i).toString();
        }
        return array;
    }

    @Override
    public List<Book> searchBooksByAuthor(String author, List<Book> books) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book bookByAuthor : books) {
            if (bookByAuthor.getAuthor().equals(author)) {
                booksByAuthor.add(bookByAuthor);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> searchBooksByAuthorV2(String author, String query, List<Book> books) {
        List<Book> booksByAuthorV2 = new ArrayList<>();
        for (Book bookByAuthor : books) {
            if (bookByAuthor.getAuthor().equals(author)
                    && bookByAuthor.getAuthor().startsWith(query)) {
                booksByAuthorV2.add(bookByAuthor);
            }
        }
        return booksByAuthorV2;
    }

    @Override
    public List<Book> searchBooksByTitle(String title, List<Book> books) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book bookByTitle : books) {
            if (bookByTitle.getTitle().equals(title)) {
                booksByTitle.add(bookByTitle);
            }
        }
        return booksByTitle;
    }

    @Override
    public List<Book> searchBooksByTitleV2(String title, String query, List<Book> books) {
        List<Book> booksByTitleV2 = new ArrayList<>();
        for (Book bookByTitle : books) {
            if (bookByTitle.getTitle().equals(title)
                    && bookByTitle.getTitle().startsWith(query)) {
                booksByTitleV2.add(bookByTitle);
            }
        }
        return booksByTitleV2;
    }

    @Override
    public BookStatus giveBookStatusRead(Book book, List<Book> books) {
        BookStatus read = BookStatus.UNREAD;
        if (searchForBook(book, books)) {
            read = BookStatus.READ;
        }
        return read;
    }

    @Override
    public BookStatus giveBookStatusUnRead(Book book, List<Book> books) {
        BookStatus read = BookStatus.READ;
        if (searchForBook(book, books)) {
            read = BookStatus.UNREAD;
        }
        return read;
    }

    public void printListOfBooks(List<Book> books) {
        System.out.println(books.size());
    }
}