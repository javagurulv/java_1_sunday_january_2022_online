package student_sergei_klunkov.lesson_9.level_7.task_31;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
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

    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
