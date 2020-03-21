package app.store;

import java.util.*;

public class Employee {
    private String name;
    private int id;
    Scanner input = new Scanner(System.in);
    Map<Product, Integer> storeStock = new HashMap<>();
    List<Product> products = new ArrayList<>();
    private  Receipt receipt;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void addProductInStore(Product produs, int stoc) {

        storeStock.put(produs, stoc);
        //products.add(produs);
    }

    public void buyProduct(Product product,int quantity) {
            for (Map.Entry<Product, Integer> intrare : storeStock.entrySet()) {
                Product key = intrare.getKey();
                int value = intrare.getValue();
                if (product.getName().equalsIgnoreCase(key.getName()) && value > quantity) {
                    storeStock.replace(key, value - quantity);
                    //products.add(key);
                    receipt.productList.put(product,quantity);
                    break;
                } else if (product.getName().equalsIgnoreCase(key.getName()) && value == quantity) {
                    storeStock.remove(key);
                    //receipt.addProduct(key,value);
                    break;
                }
            }
    }

    public Product findProduct(String name) {
        Product p = new Product();
        for (Map.Entry<Product, Integer> entry : storeStock.entrySet()) {
            Product key = entry.getKey();
            int value = entry.getValue();
            if (name.equalsIgnoreCase(key.getName())) {
                System.out.println(key.getName() +  "\n - price: " + key.getPrice() + "\n - quantity: " + value);
                p = key;
            }
        }
        return p;
    }

    public int getStock(String nume) {
        int val = 0;
        for (Map.Entry<Product, Integer> entry : storeStock.entrySet()) {
            Product key = entry.getKey();
            int value = entry.getValue();
            if (nume.equalsIgnoreCase(key.getName())) {
                val = value;
            }

        }
        return val;
    }
    public void getReceipt() {
        /*System.out.println("---------------");
        System.out.println("Name: ");
        double total=0.0;
        for (Product p : products) {
            System.out.println(p.getName());
            System.out.println("PRICE: " + p.getPrice());
            total = total +  p.getPrice();
        }
        //receipt.setTotal(total);
        System.out.println("---------------");
        System.out.println("TOTAL " + total);


         */
        receipt.print();

    }
}
