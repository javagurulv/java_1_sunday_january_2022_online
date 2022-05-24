package student_sergei_klunkov.lessson_12.level_2_to_level_6;

import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {

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
       return books.stream()
               .filter(book -> bookId.equals(book.getId()))
               .findAny();

    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .collect(Collectors.toList());
    }

    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> title.equals(book.getTitle()))
                .collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        int countBooksInLibrary = 0;
        for (Book book : books){
            if (book != null) {
                countBooksInLibrary++;
            }
        }
        return countBooksInLibrary;
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> author.equals(book.getAuthor()));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> title.equals(book.getTitle()));
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return books.stream()
                .filter(book -> searchCriteria.match(book))
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return books.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return books.stream()
                .map(book -> book.getTitle())
                .collect(Collectors.toSet());
    }
    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);

    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return books.stream()
                .collect(Collectors.toMap(book -> book.getAuthor(),
                         book -> findByAuthor(book.getAuthor()),
                        (books1, books2) -> books1));
    }

    public int countAllBooksByAuthor(String author) {
        return (int) books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .count();
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return books.stream()
                .collect(Collectors.toMap(book -> book.getAuthor()
                , book -> countAllBooksByAuthor(book.getAuthor())
                , (book1, book2) -> book1));
    }
}
