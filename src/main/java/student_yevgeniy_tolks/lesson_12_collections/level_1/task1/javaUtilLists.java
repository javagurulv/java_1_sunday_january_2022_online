package student_yevgeniy_tolks.lesson_12_collections.level_1.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class javaUtilLists {

    List<Integer> listOfNumbers = new ArrayList<>();
    List<String> listOfWords = new LinkedList<>();
    List<Double> listOfDoubles = new Vector<>();

    public void addNumbersInArrayList(int number) {
        for (Integer addNumber : listOfNumbers) {
            listOfNumbers.add(number);
            System.out.println(addNumber);
        }
    }

    public void addListOfWordsInLinkedList(String word) {
        for (String addWord : listOfWords) {
            listOfWords.add(word);
            System.out.println(addWord);
        }
    }

    public void addDoublesInVector(double number) {
        for (Double addNumber : listOfDoubles)
            listOfDoubles.add(number);
    }
}
/*
ArrayList	                                                LinkedList
It uses a dynamic array as its internal implementation.	    It uses doubly linked list as its internal implementation.
It is better in get and set operations.	                    It is better in adding and removing operations.
 ------------------------------------------------------------------------------------------------------------------------
 ArrayList	                                                        Vector
It is not synchronized.	                                         It is synchronized.
It is not a legacy class.	                                     It is a legacy class.
It increases its size by 50% of the array size.	                 It increases its size by doubling the array size i.e. 100%.
Iterator interface is used to traverse the ArrayList elements.	 Iterator or Enumeration interface can be used to traverse the Vector elements.
ArrayList is much faster than Vector because it is               Vector is slow as compared ArrayList because it is synchronized
non-synchronized.

 */

