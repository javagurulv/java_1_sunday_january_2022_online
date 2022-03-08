package student_alina_strumpe._lesson_3._level_2_intern._Task_14;

class Book {

    String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle () {

        return title;
    }

}

class BookDemo {

    public static void main(String[] args) {

        Book myBook = new Book("Principles");
        String title = myBook.getTitle();
        System.out.println("Book title = " + title);
    }
}
