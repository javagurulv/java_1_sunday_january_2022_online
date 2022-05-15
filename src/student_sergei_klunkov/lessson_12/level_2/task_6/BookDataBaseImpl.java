package student_sergei_klunkov.lessson_12.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

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

    public List<Book> getBooks() {
        return books;
    }
}
