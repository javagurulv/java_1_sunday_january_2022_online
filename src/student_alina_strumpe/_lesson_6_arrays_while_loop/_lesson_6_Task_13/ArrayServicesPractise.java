package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

public class ArrayServicesPractise {

    public static int main(String[] args) {


    //1. findEqualNumbersInArray - checkArrayForEqualNumbers
    // 2. Yes. int[] array - where to find equal numbers
    //    and int equalNumber
    // 3. Result - quantity of equal numbers and numbers- for example 2 (means - two equal numbers in array.
    // 4. integer - return ??????

   int[] array = new int[5];
    array[0]=1;
    array[1]=1;
    array[2]=1;
    array[3]=1;
    array[4]=12;
    System.out.println(array.length);
    int occ1=0;
    int number = 12;  //number for search
    for (int element : array)
        if (number == element){
            occ1++;}
            System.out.println("number"+number +"occ"+ occ1);

 //   public int countOccurrences(int[] array, int numbersForSearch){
  //      int occ = 0;
   //     for (int element : array)
    //        if (numbersForSearch == element){
     //           occ++;
      //      }
       // return occ;
      //  }
    //   iz neta:
    //    int[] mas = {1,2,3,6,6,5,5,8,9,9,9,9};
   //     int sum = 0;
    //    for (int i=0; i<mas.length-1; i++){
     //       if (mas[i]>mas[i+1]){
   //             sum +=1;
    //            System.out.println((mas[i]));
    //        }
    //    }

        int[] mas1 = {1,2,3,3,3,6,6,5,5,8,9,9,9,9};
           int occ=0;
           int x = 9;
           for (int i=0; i<mas1.length ; i++) {
               if( x == mas1[i]){
                       occ++;
               }
           }
        System.out.println(x+ "occ"+occ);
        return occ1;
    }
}

