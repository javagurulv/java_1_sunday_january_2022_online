package student_elina_kucenko.lesson5.level7;

class Task25 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.enterSizeLength();
        int[] createArray = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArray(createArray);
        arrayUtil.printArray(createArray);
    }


}



