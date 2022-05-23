package student_sergei_klunkov.lessson_12.level_2_to_level_6;

import java.util.Objects;

class Book {

    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {  this.yearOfIssue = yearOfIssue; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }


}
