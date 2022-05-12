package student_yevgeniy_tolks.lesson_12_collections.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A2", "B2");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook + " - " + books);

        Book bookIsNotInTheList = new Book("A3","A3");
        boolean doesNotContainABook = books.contains(bookIsNotInTheList);
        System.out.println(doesNotContainABook + " - Book does not exist");

    }
}
