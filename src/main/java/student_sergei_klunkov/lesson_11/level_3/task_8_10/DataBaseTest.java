package student_sergei_klunkov.lesson_11.level_3.task_8_10;

import java.util.List;
import java.util.Optional;

class DataBaseTest {

    public static void main(String[] args) {
        DataBaseTest test = new DataBaseTest();
        test.saveProductTest();
        test.findFirstSearchedProductTest();

    }

    public void saveProductTest() {
        Product product = new Product("Apple");
        int amountOfSavedProducts = 1;
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        int resultOfSavedProductsAmount = inMemoryDatabase.save(product);
        if(amountOfSavedProducts == resultOfSavedProductsAmount){
            System.out.println(" Save product " + " - Test passed! ");
        } else {
            System.out.println(" Save product " + " - Test failed! ");
        }
    }

    public void findFirstSearchedProductTest() {

        List<Product> products = List.of(
                new Product("Orange"),
                new Product("Pineapple"),
                new Product("Apple"));

        String productTitle = "Orange";
        Product expectedProduct = new Product("Orange");
        Optional<Product> expectedProductCheck = Optional.of(expectedProduct);

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Optional<Product> resultProductTitle = inMemoryDatabase.findByTitle(productTitle, products);
        System.out.println();
        System.out.println(" Amount of saved products: " + products.size());

        if(resultProductTitle.equals(expectedProductCheck)){
            System.out.println(" First Searched Product " + " - Test passed! ");
        } else {
            System.out.println(" First Searched Product " + " - Test failed! ");
        }



    }



}
