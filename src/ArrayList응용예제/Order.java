package ArrayList응용예제;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    List<Product> products;
    BigDecimal total;

    public Order() {
        total = BigDecimal.ZERO;
        products = new ArrayList<>();
    }

    public void addItem(Product product){
        products.add(product);
        total = total.add(product.getPrice());
    }
    public Product getItem(String name) {
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }
        }
        return null;
    }
    public boolean removeItem(String name){
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                total = total.subtract(product.getPrice());
                products.remove(product);
                return true;
            }

        }
        return false;
    }
    public BigDecimal calculateFinalPrice(BigDecimal tax) {
        return total.multiply(tax.add(BigDecimal.ONE)).setScale(2, RoundingMode.HALF_UP);
    }


}
