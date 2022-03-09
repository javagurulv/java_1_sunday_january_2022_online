package student_yevgeniy_tolks.lesson_3.level_2;

//Checking equality of two string

 class Task_10 {
    public static void main(String[] args) {

        String programmingLanguage = "Java";
        String programmingLanguage1 = "Python";
        String programmingLanguage2 = new String("Java");

        // checking the same sequence of characters using equals() method
        boolean checkEqualityOfStrings = programmingLanguage.equals(programmingLanguage1);
        boolean checkEqualityOfStrings1 = programmingLanguage.equals(programmingLanguage2);

        /*
        compares two object references to check whether they refer to same instance.
        Result will be false, because they are not referred to same instance
         */
        boolean stringsCompare = (programmingLanguage==programmingLanguage2);

        System.out.println(checkEqualityOfStrings);
        System.out.println(checkEqualityOfStrings1);

        System.out.println(stringsCompare);


    }
}
