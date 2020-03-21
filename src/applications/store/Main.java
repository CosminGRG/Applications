package applications.store;

public class Main {
    public static void main(String[] args) {
        SellerEmployee sellerEmployee = new SellerEmployee(1,"A");

        Product milk = new Product(1,"Milk","oat milk");
        Product cupcakes = new Product(2,"Cupcakes","homemade cupcakes");
        Product water = new Product(5,"Water", "m");

        milk.setStock(4,6.4);
        cupcakes.setStock(25,4.7);
        water.setStock(48,2);

        sellerEmployee.addProductInStore(milk);
        sellerEmployee.addProductInStore(cupcakes);
        sellerEmployee.addProductInStore(water);



        sellerEmployee.buyProduct("milk");
        //sellerEmployee.buyProduct("cupcakes");
   }
}
