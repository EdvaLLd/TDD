import se.edvard.shopping.Cart;
import se.edvard.shopping.Item;

public class Main {

    public static void main(String[] args) {
        
        Cart cart = new Cart();

        cart.addToCart(new Item("Laptop", 1000));
        cart.addToCart(new Item("Phone", 500.00),2 );

        System.out.println("Total before discount: $" + cart.calculateTotal());

        // Discount
        double discount = 10.0;
        System.out.println("Discount: $" + cart.getDiscountValue(discount));
        System.out.println("Total after discount: $" + cart.calculateTotalWithDiscount(10));

        System.out.println("Another total before discount: $" + cart.calculateTotal());
        System.out.println("Another total after discount: $" + cart.calculateTotalWithDiscount(10));
    }
}
