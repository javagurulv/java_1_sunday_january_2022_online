package student_yevgeniy_tolks.lesson_13_exceptions.level_5.task27;

import java.math.BigDecimal;
import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator productValidator = new ProductValidatorImpl(
            new ProductTitleValidationRule(),
            new ProductPriceValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.Rule1ProductTitleIsNullTest();
        test.Rule1ProductTitleIsEmptyTest();
        test.Rule2ProductTitleIsShorterThan3SymbolsTest();
        test.Rule3ProductTitleHasMoreThan100SymbolsTest();
        test.Rule4ProductTitleSymbolsTest();
        test.Rule5ProductPriceIsNullTest();
        test.Rule6ProductPriceIsZeroTest();
//        test.Rule7ProductDescriptionHasMoreThan2000SymbolsTest();
//        test.Rule8ProductDescriptionSymbolsTest();
    }

    public void Rule1ProductTitleIsNullTest() {
        Product product = new Product(null, new BigDecimal("1.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be Empty", "title");
        checkResults(exceptions.contains(rule1), "rule1_v2");
    }

    public void Rule1ProductTitleIsEmptyTest() {
        Product product = new Product("", new BigDecimal("1.00"), "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be Empty", "title");
        checkResults(exceptions.contains(rule1), "rule1_v2");
    }

    public void Rule2ProductTitleIsShorterThan3SymbolsTest() {
        Product product = new Product("MV", new BigDecimal("1.00"), "Some description");
        ValidationException rule2 = new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.contains(rule2), "rule2");
    }

    public void Rule3ProductTitleHasMoreThan100SymbolsTest() {
        Product product = new Product("jkjhvbnf,nv l.vxmc. cvxzzcjkdhgndvkjn fbxn " +
                "clkewjadldmwfsftdgsvavsffsfdsfsfsfsfsfsfjhgbadsjbsak dfssfsfsbndswfbn",
                new BigDecimal("1.00"),
                "Some description");
        ValidationException rule3 = new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.contains(rule3), "rule3");
    }

    public void Rule4ProductTitleSymbolsTest() {
        Product product = new Product("R134-", new BigDecimal("1.00"), "Some description");
        ValidationException rule4 = new ValidationException(
                "RULE-4", "Title should have english letters and numbers",
                "title");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.contains(rule4), "rule4");

    }


    public void Rule5ProductPriceIsNullTest() {
        Product product = new Product("CylinderHead", null, "Some description");
        ValidationException rule5 = new ValidationException("RULE-5", "Price can not be Empty", "price");
        List<ValidationException> exceptions = productValidator.validate(product);
        checkResults(exceptions.contains(rule5), "rule5");
    }

    public void Rule6ProductPriceIsZeroTest() {
        Product product = new Product("Crankshaft", BigDecimal.ZERO, "Some description");
        List<ValidationException> exceptions = productValidator.validate(product);
        ValidationException rule6 = new ValidationException("RULE-6", "Price can not be Zero", "price");
        checkResults(exceptions.contains(rule6), "rule6");
    }

//    public void Rule7ProductDescriptionHasMoreThan2000SymbolsTest() {
//        Product product = new Product(
//                "Cylinder head",
//                new BigDecimal("1.00"),
//                "Some description");
//        List<ValidationException> exceptions = productValidator.validate(product);
//        checkResults(exceptions.size() == 1, "rule7");
//        checkResults(exceptions.get(1).getRuleName().equals("RULE-7"), "rule7");
//        checkResults(exceptions.get(1).getFieldName().equals("description"), "rule7");
//        checkResults(exceptions.get(1).getDescription().equals(
//                        "Title can not be longer than 100 symbols"),
//                "rule7");
//    }
//
//    public void Rule8ProductDescriptionSymbolsTest() {
//        Product product = new Product("Cylinder Head", null, "Some description");
//        List<ValidationException> exceptions = productValidator.validate(product);
//        checkResults(exceptions.size() == 1, "rule8");
//        checkResults(exceptions.get(3).getRuleName().equals("RULE-8"), "rule8");
//        checkResults(exceptions.get(3).getFieldName().equals("description"), "rule8");
//        checkResults(exceptions.get(3).getDescription().equals(
//                        "Description should have english letters and numbers"),
//                "rule8");
//    }
//
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
