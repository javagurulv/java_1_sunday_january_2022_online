package student_yevgeniy_tolks.lesson_7.level_7.task13;

class WorldServiceTest {

    public static void main(String[] args) {
        WorldServiceTest worldServiceTest = new WorldServiceTest();
        worldServiceTest.findMostFrequentWordTest();
    }
        public void findMostFrequentWordTest(){
        String text = "race by race mace by mace face by face mace to mace ";
        String expectedFrequentWord = "mace";

        WorldService worldService = new WorldService();
        String resultEqualWordsInArray = worldService.findMostFrequentWord(text);
        worldService.printFoundMostFrequentWordFromTextToConsole(text);
        if(resultEqualWordsInArray.equals(expectedFrequentWord)){
            System.out.println("Most met word in text found - TEST OK");
        }else{
            System.out.println("This word is not most met in text - TEST FAILED");
        }
    }
}
