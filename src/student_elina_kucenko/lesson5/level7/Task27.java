package student_elina_kucenko.lesson5.level7;

class Task27 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.enterSizeLength();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.arrayWithRandomNumbers(array);
        arrayUtil.printArray(array);
        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.println("Max number is " + maxNumber);


    }
}

