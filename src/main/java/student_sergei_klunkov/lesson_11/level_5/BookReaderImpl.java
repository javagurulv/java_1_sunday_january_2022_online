package student_sergei_klunkov.lesson_11.level_5;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    @Override
    public boolean searchSameBooksInElectronicReader(Book book, List<Book> books) {
        boolean sameBookSearch = false;
        for (Book bookSearch : books) {
            sameBookSearch = bookSearch.equals(book);
            break;
        }
        return sameBookSearch;
    }

    @Override
    public boolean addBookToElectronicReader(Book book, List<Book> books) {
        boolean foundBook = false;
        if(!searchSameBooksInElectronicReader(book, books) && isAuthorAndTitlePresent(book, books)){
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
    public boolean searchBook(Book book, List<Book> books) {
        boolean bookFound = false;
        for(Book bookSearch : books){
            if(bookSearch.equals(book)){
                bookFound = true;
                break;
            }
        }
        return bookFound;
    }
    @Override
    public boolean deleteBook(Book book, List<Book> books) {
        if(searchBook(book, books)){
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] provideListOfBooks(List<Book> listOfBooks) {
        String[] arrayListOfBook = new String[listOfBooks.size()];
        for (int i = 0; i < arrayListOfBook.length; i++){
            arrayListOfBook[i] = listOfBooks.get(i).toString();
        }
        return arrayListOfBook;
    }

    @Override
    public List<Book> searchBooksByAuthor(String author, List<Book> books) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book bookByAuthor : books){
            if (bookByAuthor.getAuthor().equals(author)){
                booksByAuthor.add(bookByAuthor);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> searchBooksByAuthorV2(String author, String query, List<Book> books) {
        List<Book> booksByAuthorV2 = new ArrayList<>();
        for (Book bookByAuthor : books){
            if (bookByAuthor.getAuthor().equals(author) && bookByAuthor.getAuthor().startsWith(query)) {
    booksByAuthorV2.add(bookByAuthor);
            }
        }
        return booksByAuthorV2;
    }

    @Override
    public List<Book> searchBooksByTitle(String title, List<Book> books) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book bookByTitle : books) {
            if (bookByTitle.getTitle().equals(title)){
                booksByTitle.add(bookByTitle);
            }
        }
        return booksByTitle;
    }

    @Override
    public List<Book> searchBooksByTitleV2(String title, String query, List<Book> books) {
        List<Book> booksByTitleV2 = new ArrayList<>();
        for (Book bookByTitle : books) {
            if (bookByTitle.getTitle().equals(title) && bookByTitle.getTitle().startsWith(query)) {
                booksByTitleV2.add(bookByTitle);
            }
        }
        return booksByTitleV2;
    }

    @Override
    public StatusOfTheBook giveBookStatusRead(Book book, List<Book> books) {
        StatusOfTheBook read = StatusOfTheBook.UNREAD;
        if(searchBook(book, books)){
            read = StatusOfTheBook.READ;
        }
        return read;
    }

    @Override
    public StatusOfTheBook giveBookStatusUnRead(Book book, List<Book> books) {
        StatusOfTheBook read = StatusOfTheBook.READ;
        if(searchBook(book, books)){
            read = StatusOfTheBook.UNREAD;
        }
        return read;
    }

    @Override
    public List<Book> provideListOfBooksStatusRead(List<Book> listOfBooks) {
        List<Book> arrayOfReadBooks = new ArrayList<>();
        for(Book books: listOfBooks) {
            if (books.getStatus().equals(StatusOfTheBook.READ)){
                arrayOfReadBooks.add(books);
            }
        }
        System.out.println(arrayOfReadBooks);
        return arrayOfReadBooks;
    }

    @Override
    public List<Book> provideListOfBooksStatusUnRead(List<Book> listOfBooks) {
        List<Book> arrayOfUnReadBooks = new ArrayList<>();
        for (Book books : listOfBooks ) {
            if(books.getStatus().equals(StatusOfTheBook.UNREAD)){
            arrayOfUnReadBooks.add(books);
            }
        }
        System.out.println(arrayOfUnReadBooks);
        return arrayOfUnReadBooks;
    }

    public void printListOfBooks(List<Book> books) {
        System.out.println(books.size());
    }
}
