package student_deniss_dubko.deniss_dubko_lesson_12_homework.level_2_intern_level_6_middle.task_6_task_38;

import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> books = new ArrayList<>();
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
    public Optional<Book> searchById(Long bookId) {
        return books.stream()
                .filter(book -> bookId.equals(book.getId()))
                .findAny();
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> title.equals(book.getTitle()))
                .collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        return (int) books.stream()
                .map(book -> books.size())
                .count();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> author.equals(book.getAuthor()));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> title.equals(book.getTitle()));
    }

    @Override
    public List<Book> search(SearchCriteria searchCriteria) {
        return books.stream()
                .filter(book -> searchCriteria.match(book))
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> searchUniqueAuthors() {
        return books.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> searchUniqueTitles() {
        return books.stream()
                .map(book -> book.getTitle())
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Book> searchUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return books.stream()
                .collect(Collectors.toMap(book -> book.getAuthor()
                        , book -> searchByAuthor(book.getAuthor())
                        , (books1, books2) -> books1));
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