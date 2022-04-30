package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

import java.util.List;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public void takeABookFromLibrary(List<Book> bookList, Book book) {
        if (isBookFoundInLibrary()) {
            bookList.remove(book);
        }
    }

    public boolean isBookFoundInLibrary() {
        return author.equals(getAuthor()) && title.equals(getTitle());
    }
}