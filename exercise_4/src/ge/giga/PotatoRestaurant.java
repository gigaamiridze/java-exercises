package ge.giga;

public class PotatoRestaurant {

    private int maxOrderSize = 5;
    private Order[] orders = new Order[maxOrderSize];

    private int orderToServe = 0;
    private int ordersSize = 0;

    public PotatoRestaurant(int maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
        orders = new Order[maxOrderSize];
    }

    public void addOrder(Order order) {
        if (ordersSize + 1 > orders.length) {
            System.err.println("Can't add more order");
            return;
        }
        orders[(orderToServe + ordersSize) % orders.length] = order;
        ordersSize++;
        System.out.println("Added order: " + order);
    }

    public void addOrder(Order... orders) {
        for (Order order : orders) {
            addOrder(order);
        }
    }

    public void serve() {
        if(ordersSize == 0) {
            System.err.println("Nobody to serve");
            return;
        }
        final Order order = orders[orderToServe % orders.length];
        System.out.printf("Order: %s amount: %d has been served. Single cost: %.2f, Total: %.2f.\n",
                order.getName(), order.getAmount(), order.getSinglePrice(), order.getSinglePrice() * order.getAmount());

        orderToServe++;
        orderToServe %= orders.length;
        ordersSize--;
    }
}
