package student_sergei_klunkov.lessson_12.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDataBaseImpl implements BookDataBase {

    private final List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        boolean deleteBookByID = false;
        for (Book book  : books) {
            if(bookId.equals(book.getId())){
                books.remove(book);
                deleteBookByID = true;
                break;
            }
        }
        return deleteBookByID;
    }
    public boolean delete(Book book){
        boolean deleteBook = false;
        for(Book bookList : books){
            if(book.equals(bookList)){
                books.remove(book);
                deleteBook = true;
                break;
            }
        }
        return deleteBook;
    }
    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }

    public List<Book> getBooks() {
        return books;
    }
}
