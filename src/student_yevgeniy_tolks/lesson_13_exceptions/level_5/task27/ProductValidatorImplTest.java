package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.math.BigDecimal;
import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator productValidator = new ProductValidatorImpl();

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.Rule1ProductTitleIsNullTest();
        test.Rule1ProductTitleIsEmptyTest();
        test.Rule2ProductTitleIsShorterThan3SymbolsTest();
        test.Rule3ProductTitleHasMoreThan100SymbolsTest();
        test.Rule4ProductTitleSymbolsTest();
        test.Rule5ProductPriceIsNullTest();
        test.Rule5ProductPriceIsEmptyTest();
        test.Rule6ProductPriceIsZeroTest();
        test.Rule7ProductDescriptionHasMoreThan2000SymbolsTest();
        test.Rule8ProductDescriptionSymbolsTest();
    }

    public void Rule1ProductTitleIsNullTest() {
        Product product = new Product(null, new BigDecimal("1.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be Empty"), "rule1");
    }

    public void Rule1ProductTitleIsEmptyTest() {
        Product product = new Product("", new BigDecimal("1.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be Empty"), "rule1");
    }

    public void Rule2ProductTitleIsShorterThan3SymbolsTest() {
        Product product = new Product("ap", new BigDecimal("1.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule2");
        checkResults(exceptions.get(1).getRuleName().equals("RULE-2"), "rule2");
        checkResults(exceptions.get(1).getFieldName().equals("title"), "rule2");
        checkResults(exceptions.get(1).getDescription().equals("Title can not be shorter than 3 symbols"), "rule1");
    }

    public void Rule3ProductTitleHasMoreThan100SymbolsTest() {
        Product product = new Product("produst product product productlkadewrwbkjfbskdfbskfbxn clkewjadl" +
                "dmwfsftdgsvavsffsfdsfsfsfsfsfsfjhgbadsjbsak dfssfsfsbndswfbn",
                new BigDecimal("1.00"),
                "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule3");
        checkResults(exceptions.get(2).getRuleName().equals("RULE-3"), "rule3");
        checkResults(exceptions.get(2).getFieldName().equals("title"), "rule3");
        checkResults(exceptions.get(2).getDescription().equals("Title can not be longer than 100 symbols"), "rule3");
    }

    public void Rule4ProductTitleSymbolsTest() {
        Product product = new Product("Cylinder Head", null, "Some description23/23^2+");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule4");
        checkResults(exceptions.get(3).getRuleName().equals("RULE-4"), "rule4");
        checkResults(exceptions.get(3).getFieldName().equals("price"), "rule4");
        checkResults(exceptions.get(3).getDescription().equals("Title should have english letters and numbers"), "rule4");
    }


    public void Rule5ProductPriceIsNullTest() {
        Product product = new Product("Cylinder Head", null, "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(3).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(3).getFieldName().equals("price"), "rule5");
        checkResults(exceptions.get(3).getDescription().equals("Price can not be Empty"), "rule5");
    }

    public void Rule5ProductPriceIsEmptyTest() {
        Product product = new Product("Cylinder Head", new BigDecimal(""), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(3).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(3).getFieldName().equals("price"), "rule5");
        checkResults(exceptions.get(3).getDescription().equals("Price can not be Empty"), "rule5");
    }

    public void Rule6ProductPriceIsZeroTest() {
        Product product = new Product("Cylinder Head", new BigDecimal("0.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule6");
        checkResults(exceptions.get(3).getRuleName().equals("RULE-6"), "rule6");
        checkResults(exceptions.get(3).getFieldName().equals("price"), "rule6");
        checkResults(exceptions.get(3).getDescription().equals("Price can not be Zero"), "rule6");
    }

    public void Rule7ProductDescriptionHasMoreThan2000SymbolsTest() {
        Product product = new Product(
                "Cylinder head",
                new BigDecimal("1.00"),
                "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule7");
        checkResults(exceptions.get(1).getRuleName().equals("RULE-7"), "rule7");
        checkResults(exceptions.get(1).getFieldName().equals("description"), "rule7");
        checkResults(exceptions.get(1).getDescription().equals(
                        "Title can not be longer than 100 symbols"),
                "rule7");
    }

    public void Rule8ProductDescriptionSymbolsTest() {
        Product product = new Product("Cylinder Head", null, "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.size() == 1, "rule8");
        checkResults(exceptions.get(3).getRuleName().equals("RULE-8"), "rule8");
        checkResults(exceptions.get(3).getFieldName().equals("description"), "rule8");
        checkResults(exceptions.get(3).getDescription().equals(
                        "Description should have english letters and numbers"),
                "rule8");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
