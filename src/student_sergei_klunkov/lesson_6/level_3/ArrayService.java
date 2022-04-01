package student_sergei_klunkov.lesson_6.level_3;

class ArrayService {

    public boolean contains(int[] array, int numbersToSearch){

        boolean found = false;

        for(int element : array){
            if (element == numbersToSearch){
                found = true;
                break;
            }
        }
        System.out.println(found);
        return found;
    }
}
