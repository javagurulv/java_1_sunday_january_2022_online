package student_sergei_klunkov.lesson_11.level_5;

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
}
