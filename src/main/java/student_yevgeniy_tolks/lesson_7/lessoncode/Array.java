package student_yevgeniy_tolks.lesson_7.lessoncode;

class Array {

    public int [] createArray(int arrayLenght){
        return new int[arrayLenght];
    }

    public void fillArray(int [] array){
        array[0]=1;
        array[1]=2;
        array[2]=4;
    }

    public void printArrayValuesOnConsole(int [] array){
        for(int arrValue : array){
            System.out.println(arrValue);
        }

    }
}
