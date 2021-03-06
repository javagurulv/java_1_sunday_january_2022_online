package student_sergei_klunkov.lesson_7.level_6;

class ArrayCopy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] out = newCopiedArray(in.length);
        int source;
        for (int i = 0; i < in.length; i++) {
            source = in[i];
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                out[i] = source;
            }
        }
        return out;
    }

    public int[] newCopiedArray(int arrayLength) {
        return new int[arrayLength];
    }


}
