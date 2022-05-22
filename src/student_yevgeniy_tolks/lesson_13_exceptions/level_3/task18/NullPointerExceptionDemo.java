package student_yevgeniy_tolks.lesson_13_exceptions.level_3.task18;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
//    Object object=null;
//    object.hashCode();

        //reference obj equals to null, but is not pointing to any object in heap
        //by calling built-in hashcode method, where is no code to in the location
        // where reference is pointing, so result is obvious by NullPointerException
        // extended from unchecked exception class RuntimeException
    }
}
