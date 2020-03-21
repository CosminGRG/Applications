package app.store;

public class Product {
    private String name;
    private double price;
    private Stock stock;
    private String description;
    private Data expirationDate;
    private Data productionDate;

    public Product(String name, double price,String description, Data expirationDate, Data productionDate) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public Product() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Data getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Data expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Data getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Data productionDate) {
        this.productionDate = productionDate;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
