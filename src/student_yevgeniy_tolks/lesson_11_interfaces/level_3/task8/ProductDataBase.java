package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8;

interface ProductDataBase {
    String save(Product product);

    boolean findByTitle(String productTitle,Product product);
}
