package se.edvard.shopping;

public class Items {
    Item item;
    int quantity;

    public Items(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }


    public Item getItem() {
        return item;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
