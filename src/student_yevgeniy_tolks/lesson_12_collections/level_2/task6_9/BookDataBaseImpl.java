package student_yevgeniy_tolks.lesson_12_collections.level_2.task6_9;

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
        boolean deleteBookById = false;
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                books.remove(book);
                deleteBookById = true;
                break;
            }
        }
        return deleteBookById;
    }

    @Override
    public boolean delete(Book book) {
        boolean deleteBook = false;
        for (Book bookList : books) {
            if (book.equals(bookList)) {
                books.remove(book);
                deleteBook = true;
                break;
            }
        }
        return deleteBook;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> bookList = Optional.empty();
        for (Book book : books) {
            if (bookId.equals(book.getId())) {
                bookList = Optional.of(book);
            }
        }
        return bookList;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findBookByAuthor = new ArrayList<>();
        for (Book book: books){
            if(author.equals(book.getAuthor())){
                findBookByAuthor.add(book);
            }
        }
        return findBookByAuthor;
    }

    public List<Book> getBooks() {
        return books;
    }
}


