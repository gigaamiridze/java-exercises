package ge.giga;

public class Main {
    public static void main(String[] args) {
        new Blocks();

        PotatoRestaurant restaurant = new PotatoRestaurant(3);
        restaurant.addOrder(new Order[] {
                new Order("Order_1", 1.75, 2),
                new Order("Order_1", 2.50, 5),
                new Order("Order_1", 3.50, 7),
                new Order("Order_1", 4.80, 3)
        });

        restaurant.serve();
    }
}
