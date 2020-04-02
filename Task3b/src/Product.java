public class Product {

    public String name;
    public int price, quantity;

    public Product (String name, int price, int quantity) {
        this.name  = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

}



