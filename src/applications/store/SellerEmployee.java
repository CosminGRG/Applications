package applications.store;

import java.util.HashMap;
import java.util.Map;

public class SellerEmployee extends Employee {
    Map<Product, Integer> productList = new HashMap<>();

    private Receipt receipt;

    public SellerEmployee(int id, String name) {
        super(id, name);
    }

    public void addProductInStore(Product product) {
        productList.put(product, product.getStock().getQuantity());
    }

    public void getReceipt() {
        double total;
        System.out.println("Ati cumparat . . . ");
        System.out.println("Items: ");
        for (Product p : receipt.getProductList()) {
            System.out.println("- " + p.getName());
            total = p.getStock().getQuantity() * p.getStock().getPrice();
            receipt.setTotal(total);
        }
        System.out.println("TOTAL : " + receipt.getTotal() + " RON");
        System.out.println("O zi buna! ");
    }

    public void buyProduct(String name) {
        for (Product p : receipt.getProductList()) {
            for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
                Product key = entry.getKey();
                int value = entry.getValue();
                if (key.getName().equalsIgnoreCase(name) && value > 1) {
                    productList.replace(key, value - 1);
                    break;
                } else if (key.getName().equalsIgnoreCase(name) && value == 1) {
                    productList.remove(key);
                    break;
                }
            }
        }
    }
}