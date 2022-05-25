package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task7;
//@FunctionalInterface
public interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);

    /*
    This interface is not functional interface, cause multiple non-overriding abstract methods found
    in the interface.  A functional interface is an interface that contains only one abstract method.
    They can have only one functionality to exhibit (used in lambda expressions). To check whether
    interface is functional, option to write check annotation @FunctionalInterface.
     */
}
