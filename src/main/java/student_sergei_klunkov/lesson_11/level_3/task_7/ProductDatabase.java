package student_sergei_klunkov.lesson_11.level_3.task_7;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

    // Этот интерфес не является функциональным, так как содержит неаколько абстрактных методов без переопределения.

}
