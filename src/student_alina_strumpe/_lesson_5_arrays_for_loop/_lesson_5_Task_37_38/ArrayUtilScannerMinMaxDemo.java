package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_37_38;

 class ArrayUtilScannerMinMaxDemo {

    public static void main(String[] args){

        ArrayUtilScannerMinMax arrayUtilScannerMinMax = new ArrayUtilScannerMinMax();
        int[] shoesArray = arrayUtilScannerMinMax.createArray(4);
        arrayUtilScannerMinMax.fillArrayFromUser(shoesArray);
        arrayUtilScannerMinMax.printArray(shoesArray);
        int minInShoesArray = arrayUtilScannerMinMax.findMinInArray(shoesArray);
        int maxInShoesArray = arrayUtilScannerMinMax.findMaxInArray(shoesArray);
        System.out.println(minInShoesArray);
        System.out.println(maxInShoesArray);

    }
}
