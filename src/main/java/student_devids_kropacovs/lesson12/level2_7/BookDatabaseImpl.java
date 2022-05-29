package student_devids_kropacovs.lesson12.level2_7;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();
    private long idForBook;

    public BookDatabaseImpl(long idForBook) {
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
            if(bookToCheck.getId() == bookId){
                bookList.remove(bookToCheck);
                return true;
            }
        }
        return false;
    }

}
