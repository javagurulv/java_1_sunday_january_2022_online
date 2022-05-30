package student_devids_kropacovs.lesson12.level2_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();
    private long idForBook;

    public BookDatabaseImpl() {
        this.idForBook = 0;
    }

    @Override
    public Long save(Book book) {
        this.idForBook = idForBook + 1;
        book.setId(idForBook);
        bookList.add(book);
        return idForBook;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book bookToCheck : bookList){
            if(Objects.equals(bookToCheck.getId(), bookId)){
                bookList.remove(bookToCheck);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookToCheck : bookList){
            if(bookToCheck.equals(book)){
                bookList.remove(bookToCheck);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for(Book book: bookList){
            if(book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookListOfOneAuthor = new ArrayList<>();
        for(Book book: bookList){
            if(book.getAuthor().equals(author)){
                bookListOfOneAuthor.add(book);
            }
        }
        return bookListOfOneAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListOfBookWithSameTitle = new ArrayList<>();
        for(Book book: bookList){
            if(book.getTitle().equals(title)){
                bookListOfBookWithSameTitle.add(book);
            }
        }
        return bookListOfBookWithSameTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for(Book book : bookList){
            if(book.getAuthor().equals(author)){
                bookList.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for(Book book : bookList){
            if(book.getTitle().equals(title)){
                bookList.remove(book);
            }
        }
    }

}
