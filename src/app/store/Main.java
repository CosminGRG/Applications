package app.store;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data expirationDate = new Data(2020, 13, 9);
        Data productionDate = new Data(2020, 27, 1);

        Employee employee = new Employee("A",1);

        Product milk = new Product("Milk",7.3,"oat milk",productionDate,expirationDate);
        Product cupcakes = new Product("Cupcakes",10,"homemade cupcakes",productionDate,expirationDate);
        Product smoothie = new Product("Smoothie",9, "",productionDate,expirationDate);

        employee.addProductInStore(milk,25);
        employee.addProductInStore(cupcakes,10);
        employee.addProductInStore(smoothie,7);


        employee.buyProduct(milk,2);
        employee.buyProduct(cupcakes,3);
        //employee.findProduct("milk");
       // employee.getReceipt();
    }
}
