package ArrayList응용예제;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;

    public Product( String name,BigDecimal price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
