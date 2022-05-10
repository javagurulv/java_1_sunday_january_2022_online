package student_yevgeniy_tolks.lesson_11_interfaces.level_5_6.task13_24;

class Book {

    private String author;
    private String title;
private BookStatus status;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public String toString() {
        return title +
                " [" + author + "]";
    }
}
