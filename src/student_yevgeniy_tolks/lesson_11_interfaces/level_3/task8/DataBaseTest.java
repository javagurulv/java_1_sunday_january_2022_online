package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8;

class DataBaseTest {

    public static void main(String[] args) {
        DataBaseTest dataBaseTest = new DataBaseTest();
        dataBaseTest.productSaveTest();
        dataBaseTest.findFirstOccurrenceProductTest();

    }

    public void productSaveTest() {
        Product product = new Product("Cylinder head");
        String expectedProductTitle = "Cylinder head";

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        String resultProductTitle = inMemoryDatabase.save(product);
        if (expectedProductTitle.equals(resultProductTitle)) {
            System.out.println("Product saved - TEST OK");
        } else {
            System.out.println("Something went wrong - TEST FAILED");
        }
    }

    public void findFirstOccurrenceProductTest() {
        Product product = new Product("Turbocharger");
        String productTitle = "Turbocharger";

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        boolean resultProductTitle = inMemoryDatabase.findByTitle(productTitle, product);
        if (resultProductTitle) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Test failed");
        }
    }
}

