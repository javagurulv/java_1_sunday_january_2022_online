package student_alina_strumpe._lesson_2_level_2_intern_Task_3;

import java.awt.event.WindowEvent;  // удалить этот импорт

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
       //int[] cordPlaced = {1,2,3};
        book1.setValues("Dandelion Wine "," romance",1,11, new int[] {1,2,3});
        String info = book1.getValues();
        System.out.println(info);

      
       // dandelionWine.bookName = "Dandelion Wine";
       // dandelionWine.bookGenre = "romance";
        //dandelionWine.bookID = 1;
        //dandelionWine.bookNumber = 11;
     

        Book book2 = new Book();
        //int[] cordPlaced2 = {4,5,6};
        book2.setValues("Three comrades","romance",2,12, new int[] {4,5,6});
        String info2 = book2.getValues();
        System.out.println(info2);

//        book2.bookName = "Three comrades";
//        book2.bookGenre = "romance";
//        book2.bookID = 2;
//        book2.bookNumber= 15;

        Book book3 = new Book();
        //int [] cordPlaced3 = {1,4,7};
        book3.setValues("Fahrenheit 451", "sci-fix", 3,13, new int[] {1,4,7});
        String info3 = book3.getValues();
        System.out.println(info3);

//        book3.bookName = "Fahrenheit 451";
//        book3.bookGenre = "sci-fix";
//        book3.bookID = 2;
//        book3.bookNumber = 15;

        Book book4 = new Book();
       // int[] cordPlaced4 = {3,6,9};
        //int sum =0;
        book4.setValues("War and Piece", "romance", 4,14, new int[] {3,6,9});
        String info4 = book4.getValues();
        System.out.println(info4);

//        book4.bookName = "War And Piece";
//        book4.bookGenre = "romance";
//        book4.bookID = 2;
//        book4.bookNumber = 15;


//        book4 = book2;
//        book4.changeDetails("War and Piece", "romance", 2,15, new int[] {3,6,9});


    }
}








