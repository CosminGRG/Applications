package app.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Receipt {
    double total;
    Map<Product, Integer> productList = new HashMap<>();


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProduct( Product product,int quantity) {
        productList.put(product,quantity);
    }

   public void print() {

           System.out.println("---------------");
           System.out.println("Name: ");
           double total=0.0;
       for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
           Product key = entry.getKey();
           int value = entry.getValue();
               System.out.println(key.getName());
               System.out.println("PRICE: " + key.getPrice());
               total = total +  key.getPrice();

          this.setTotal(total);
           System.out.println("---------------");
           System.out.println("TOTAL " + this.getTotal());

       }
   }
}
