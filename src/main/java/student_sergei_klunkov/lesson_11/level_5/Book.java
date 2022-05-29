package student_sergei_klunkov.lesson_11.level_5;



class Book {

    private String author;
    private String title;
    private StatusOfTheBook status;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public StatusOfTheBook getStatus() {
        return status;
    }

    public void setStatus(StatusOfTheBook status) {
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
