package student_sergei_klunkov.lesson_11.level_3.task_8_10;

import java.util.Objects;

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Product product = (Product)o;
        return Objects.equals(title, product.title);
    }

}
