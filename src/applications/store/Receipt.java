package applications.store;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private double total;
    private List<Product> products = new ArrayList<>();

    public List<Product> getProductList() {
        return products;
    }

    public void setProductList(List<Product> productList) {
        this.products = productList;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
