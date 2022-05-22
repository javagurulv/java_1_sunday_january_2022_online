package student_devids_kropacovs.lesson11.level3.task8_10;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
