package se.edvard.shopping;

import java.util.ArrayList;

public class Cart {
    ArrayList<Items> itemsCart = new ArrayList<>();

    public void addToCart(Item item, int count){
        itemsCart.add(new Items(item, count));
    }

    public void addToCart(Item item){
        addToCart(item, 1);
    }

    public double calculateTotal(){
       double value = 0;
       for(Items item : itemsCart){
           value += item.getTotalPrice();
       }
       return value;
    }

    public double calculateTotalWithDiscount(double discount)
    {
        return calculateTotal() - getDiscountValue(discount);
    }

    public double getDiscountValue(double discount)
    {
        return calculateTotal() * (discount/100);
    }
}
