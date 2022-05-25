package student_sergei_klunkov.lesson_6.lessoncode;


class DoubleForExample {

    public static void main(String[] args) {

        int [][] arr = {{0, 1, 7},
                        {4, 5, 9},
                        {7, 8, 0}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                int number = arr[i][j];
                System.out.println("[" + i + "," + j + "] = " + number);
            }
        }
    }

}
