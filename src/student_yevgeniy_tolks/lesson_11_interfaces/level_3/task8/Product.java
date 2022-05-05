package student_yevgeniy_tolks.lesson_11_interfaces.level_3.task8;

import java.util.Objects;

class Product {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

}
