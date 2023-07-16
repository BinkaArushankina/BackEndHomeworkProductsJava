package models;

public class Products {
    private String name;
    private String quantity;
    private String expired;


    public Products(String name, String quantity, String expired) {
        this.name = name;
        this.quantity = quantity;
        this.expired = expired;
    }


    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String isExpired() {
        return expired;
    }

    @Override
    public String toString() {
        return name +" "+ quantity +" "+ expired ;
    }
}
