package student_devids_kropacovs.lesson11.level3.task8_10;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements ProductDatabase{
    private List<Product> productList = new ArrayList<>();


    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {

       for(Product product : productList){
           if(productTitle.equals(product .getTitle())){
               return product;
           }
       }

        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
