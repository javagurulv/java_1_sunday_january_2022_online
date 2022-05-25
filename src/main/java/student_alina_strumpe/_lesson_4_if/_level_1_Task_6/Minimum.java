package student_alina_strumpe._lesson_4_if._level_1_Task_6;

 class Minimum {
     public int i;
    // metod {  perem min, loop { uslovie }  ,return }

    public int min(int [] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }



}
