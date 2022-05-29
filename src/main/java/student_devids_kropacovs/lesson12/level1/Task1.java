package student_devids_kropacovs.lesson12.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> integerList = new LinkedList<>();
        //In Arraylist when we add an element the java function creates new array that is longer than previous, copy all the
        //elements and add new element to the new spot.
        //In linked list we can add, remove elements to/from certain position and it works differently, this do not create new array.
        //ArrayList internally uses a dynamic array to store its elements. LinkedList uses Doubly Linked List to store its elements.
        // ArrayList is slow as array manipulation is slower. LinkedList is faster being node based as not much bit shifting required.
    }
}
