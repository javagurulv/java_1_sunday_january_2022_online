package student_yevgeniy_tolks.lesson_13_exceptions.level_5_6.task27_46;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ProductValidatorImplTestJUnit {
    private ProductValidator productValidator = new ProductValidatorImpl(
            new ProductTitleValidationRule(),
            new ProductPriceValidationRule(),
            new ProductDescriptionValidationRule());

    @Test
    public void Rule1ProductTitleIsNullJUnitTest() {
        Product product = new Product(null, new BigDecimal("1.00"), "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-1", "Title can not be Empty", "title")));
    }

    @Test
    public void Rule1ProductTitleIsEmptyJUnitTest() {
        Product product = new Product("", new BigDecimal("1.00"), "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-1", "Title can not be Empty", "title")));
    }

    @Test
    public void Rule2ProductTitleIsShorterThan3SymbolsJUnitTest() {
        Product product = new Product("MV", new BigDecimal("1.00"), "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-2", "Title can not be shorter than 3 symbols", "title")));
    }

    @Test
    public void Rule3ProductTitleHasMoreThan100SymbolsTest() {
        String productTitleLength = String.valueOf(new char[101]);
        Product product = new Product(productTitleLength, new BigDecimal("1.00"), "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title")));
    }

    @Test
    public void Rule4ProductTitleSymbolsJUnitTest() {
        Product product = new Product("-R134", new BigDecimal("1.00"), "Somedescription");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException(
                "RULE-4", "Title should have english letters and numbers",
                "title")));
    }

    @Test
    public void Rule5ProductPriceIsNullJUnitTest() {
        Product product = new Product("CylinderHead", null, "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-5", "Price can not be Empty", "price")));
    }

    @Test
    public void Rule6ProductPriceIsZeroJUnitTest() {
        Product product = new Product("Crankshaft", BigDecimal.ZERO, "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-6", "Price can not be Zero", "price")));
    }

    @Test
    public void Rule7ProductDescriptionHasMoreThan2000SymbolsTest() {
        String descriptionLength = String.valueOf(new char[2001]);
        Product product = new Product("Cylinder head", new BigDecimal("1.00"), descriptionLength);
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-7", "To long product description content",
                "description")));
    }

    @Test
    public void Rule8ProductDescriptionSymbolsJUnitTest() {
        Product product = new Product("Cylinder Head", new BigDecimal("1.00"), "Some/description");
        List<ValidationException> expectedException = productValidator.validate(product);
        assertTrue(expectedException.contains(new ValidationException("RULE-8", "Description should have english " +
                "letters and numbers", "description")));

    }

    @Test
    public void Rule9TitleIsNullAndPriceIsZeroJUnitTest() {
        Product product = new Product(null, BigDecimal.ZERO, "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be Empty", "title");
        ValidationException rule6 = new ValidationException("RULE-6", "Price can not be Zero", "price");
        assertTrue(expectedException.contains(rule1) && expectedException.contains(rule6));
    }

    @Test
    public void Rule10TitleIsEmptyAndPriceIsZeroJUnitTest() {
        Product product = new Product("", BigDecimal.ZERO, "Some description");
        List<ValidationException> expectedException = productValidator.validate(product);
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be Empty", "title");
        ValidationException rule6 = new ValidationException("RULE-6", "Price can not be Zero", "price");
        assertTrue(expectedException.contains(rule1) && expectedException.contains(rule6));
    }

    @Test
    public void Rule11WrongTitleAndDescriptionFormatJUnitTest() {
        Product product = new Product("-R134", new BigDecimal("1.00"), "Some/description");
        List<ValidationException> expectedException = productValidator.validate(product);
        ValidationException rule4 = new ValidationException(
                "RULE-4", "Title should have english letters and numbers",
                "title");
        ValidationException rule8 = new ValidationException("RULE-8", "Description should have english " +
                "letters and numbers", "description");
        assertTrue(expectedException.contains(rule4) && expectedException.contains(rule8));
    }

    @Test
    public void Rule12LengthOfTitleAndDescriptionOutOFRangeJUnitTest() {
        String productTitleLength = String.valueOf(new char[101]);
        String descriptionLength = String.valueOf(new char[2001]);
        Product product = new Product(productTitleLength, new BigDecimal("1.00"), descriptionLength);
        List<ValidationException> expectedException = productValidator.validate(product);
        ValidationException rule7 = new ValidationException("RULE-7", "To long product description content", "description");
        ValidationException rule3 = new ValidationException("RULE-3", "Title can not be longer than 100 symbols", "title");
        assertTrue(expectedException.contains(rule3) && expectedException.contains(rule7));
    }

    @Test
    public void rule13AllThreeRulesFailedJUnitTest() {
        Product product = new Product("", BigDecimal.ZERO, "Some_description");
        List<ValidationException> expectedException = productValidator.validate(product);
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be Empty", "title");
        ValidationException rule6 = new ValidationException("RULE-6", "Price can not be Zero", "price");
        ValidationException rule8 = new ValidationException("RULE-8", "Description should have english " +
                "letters and numbers", "description");
        assertTrue(expectedException.contains(rule1)
                && expectedException.contains(rule6)
                && expectedException.contains(rule8));
    }
}