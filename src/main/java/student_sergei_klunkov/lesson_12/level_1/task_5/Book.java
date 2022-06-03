package student_sergei_klunkov.lesson_12.level_1.task_5;


import java.util.Objects;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;

    }

    public boolean equals(Object i) {
        if (this == i) return true;
        if (i == null || getClass() != i.getClass()) return false;
        Book book = (Book) i;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

}
