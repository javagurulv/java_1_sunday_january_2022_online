package student_yevgeniy_tolks.lesson_9.level_7.task31.domain_model;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBookFoundInLibrary() {
        return author.equals(getAuthor()) && title.equals(getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}