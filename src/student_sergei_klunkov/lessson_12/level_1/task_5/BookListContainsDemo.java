package student_sergei_klunkov.lessson_12.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {


    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);


        Book booksInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(booksInTheList);
        System.out.println("This book is in library! - " + containsBook);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("This book is not in library! - " + notContainsBook);

    }
}
