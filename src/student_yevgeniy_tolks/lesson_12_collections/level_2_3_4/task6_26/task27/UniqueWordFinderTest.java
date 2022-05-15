package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4.task6_26.task27;

import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest();
    }

    public void uniqueWordFinderTest() {
        String text = "new story about new adventures in new York city";
        Set<String> expectedUniqueWords = Set.of(
                "new",
                "story",
                "about",
                "adventures",
                "in",
                "York",
                "city");

        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> resultOfUniqueWordFinder = uniqueWordFinder.find(text);

        if (expectedUniqueWords.equals(resultOfUniqueWordFinder)) {
            System.out.println("Task27.TEST OK");
        } else {
            System.out.println("Task27.TEST FAILED");
        }
    }
}