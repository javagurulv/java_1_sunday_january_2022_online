package student_devids_kropacovs.lesson11.level5_6.task13_24;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{

    private List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBookToLibrary(Book bookToAdd) {

        for(Book book : bookList){
            if(bookToAdd.equals(book)){
                System.out.println("This book in already in library");
                return false;
            }
        }
        bookList.add(bookToAdd);
        return true;
    }

    @Override
    public void showBookList() {
        int counter = 1;
        for(Book book : bookList){
            System.out.println("Book no. " + counter + ": " + book.toString());
            counter++;
        }
    }

    @Override
    public List<Book> findBookByAuthor(String authorName) {
        List<Book> booksListWithOneAuthorBooks = new ArrayList<>();
        for(Book book : bookList){
            if (authorIsEqual(book, authorName)){
                booksListWithOneAuthorBooks.add(book);
            }
        }
        return booksListWithOneAuthorBooks;
    }

    @Override
    public List<Book> findBookByPartOfTheAuthorName(String authorName) {
        List<Book> booksListWithOneAuthorBooks = new ArrayList<>();
        for(Book book : bookList){
            if (book.getBookAuthor().startsWith(authorName)){
                booksListWithOneAuthorBooks.add(book);
            }
        }
        return booksListWithOneAuthorBooks;
    }

    public boolean authorIsEqual(Book book, String author){
        return book.getBookAuthor().equals(author);
    }
}
