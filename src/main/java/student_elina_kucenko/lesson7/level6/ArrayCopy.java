package student_elina_kucenko.lesson7.level6;

import java.util.Arrays;

class ArrayCopy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] arr = new int[in.length];
        int counter = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                arr[counter] = in[i];
                counter++;
            }
        }
        int[] result = new int[counter];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

