package student_sergei_klunkov.lesson_7.level_1;


import java.util.*;


class WordService {

    public void howManyWordsInText() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Print the text or words: ");
        String input = sc.nextLine();
        int wordsAmount = 0;
        if(input.length() != 0){
            wordsAmount++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    wordsAmount++;
                }
            }
        }
        System.out.println(" Amount of words: " + wordsAmount);
    }

    static void amountOfFrequentWordsInText() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Print the text or words: ");
        String input = sc.nextLine();
        Map<String,Integer> mp=new TreeMap<>();

        String arr[]=input.split(" ");

        for(int i=0;i<arr.length;i++) {
            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            } else {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:
                mp.entrySet()) {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                i++;
            }
        }
    }

}


