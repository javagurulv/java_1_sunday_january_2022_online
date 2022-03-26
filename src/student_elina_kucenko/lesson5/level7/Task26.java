package student_elina_kucenko.lesson5.level7;

class Task26 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.enterSizeLength();
        int[] createArrayWithRandomNumbers = arrayUtil.createArray(arrayLength);
        arrayUtil.arrayWithRandomNumbers(createArrayWithRandomNumbers);
        arrayUtil.printArray(createArrayWithRandomNumbers);

    }
}
