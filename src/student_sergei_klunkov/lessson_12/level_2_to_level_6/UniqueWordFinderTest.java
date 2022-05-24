package student_sergei_klunkov.lessson_12.level_2_to_level_6;

import java.util.Set;
class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest();

    }
    public void uniqueWordFinderTest() {
        String text = "Learning java is not easy but its cool";
        Set<String> expectedUniqueWords = Set.of(
                "Learning",
                "java",
                "is",
                "not",
                "easy",
                "but",
                "its",
                "cool" );
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> resultOfFindingUniqueWords = uniqueWordFinder.find(text);

        if (expectedUniqueWords.equals(resultOfFindingUniqueWords)) {
            System.out.println(" Unique Words Finder " + " - Test passed! ");
        } else {
            System.out.println(" Unique Words Finder " + " - Test failed! ");
        }
    }

}
