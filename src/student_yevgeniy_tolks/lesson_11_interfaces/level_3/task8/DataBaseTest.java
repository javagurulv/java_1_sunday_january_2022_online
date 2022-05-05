package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class DataBaseTest {

    public static void main(String[] args) {
        DataBaseTest dataBaseTest = new DataBaseTest();
        dataBaseTest.productSaveTest();
        dataBaseTest.findFirstOccurrenceProductV2Test();
    }

    public void productSaveTest() {
        Product product = new Product("Cylinder head");
        int amountOfProductsSaved = 1;
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        int resultAmountOfProductsSaved = inMemoryDatabase.save(product);
        if (amountOfProductsSaved == resultAmountOfProductsSaved) {
            System.out.println("Product saved - TEST OK");
        } else {
            System.out.println("Something went wrong - TEST FAILED");
        }
    }

    public void findFirstOccurrenceProductV2Test() {

        List<Product> products = List.of(
                new Product("Turbocharger"),
                new Product("Cylinder head"),
                new Product("Injector"));

        String productTitle = "Turbocharger";
        Product expectedProduct = new Product("Turbocharger");
        Optional<Product> expectedProductCheck = Optional.of(expectedProduct);

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Optional<Product> resultProductTitle = inMemoryDatabase.findByTitle(productTitle, products);
        System.out.println();
        System.out.println("Amount of products saved: " + products.size());

        if (resultProductTitle.equals(expectedProductCheck)) {
            System.out.println("Product found -  TEST OK");
        } else {
            System.out.println("Test failed");
        }
    }
}

