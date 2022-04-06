package student_devids_kropacovs.lesson7.task12;

public class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        int secondArrayLength = 0;
        for (int i = 0; i < in.length; i++){
            if(in[i] >= numberFrom && in[i] <= numberTo){
                secondArrayLength++;
            }
        }

        int newArray[] = new int[secondArrayLength];
        int copiedElementCounter = 0;
        for (int i = 0; i < in.length; i++){
            if(in[i] >= numberFrom && in[i] <= numberTo){
                newArray[copiedElementCounter] = in[i];
                copiedElementCounter++;
            }
        }
        return newArray;
    }

}
