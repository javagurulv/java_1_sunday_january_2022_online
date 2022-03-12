package student_alina_strumpe._lesson_2_level_2_intern_Task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    public String bookName;
    public String bookGenre;
    public int bookID;
    public int bookNumber;
    public int[] cordPlaced;


    public String setValues(String _bookName, String _bookGenre, int _bookID, int _bookNumber, int[] _cordPlaced) {
        String param = (_bookName + _bookGenre + _bookID + _bookNumber);
        bookName = _bookName;
        bookGenre = _bookGenre;
        bookID = _bookID;
        bookNumber = _bookNumber;
        cordPlaced = _cordPlaced;


        return param;

    }

    public String getValues() {
        String info = ("Book name: " + bookName + "\n" + "Book genre: " + bookGenre + "\n" + "BookID: " + bookID
                + "\n" + "BookNumber: " + bookNumber + "\n");
        String bookPlaced = "Book placed: "+ "\n";


        for (int i = 0; i < cordPlaced.length; i++) {
            bookPlaced += cordPlaced[i] + "\n";
        }

                return info + bookPlaced;

}
        }














