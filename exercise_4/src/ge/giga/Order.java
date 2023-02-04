package ge.giga;

public class Order {

    private String name;
    private double singlePrice;
    private int amount;

    public Order() {
    }

    public Order(String name, double singlePrice, int amount) {
        this.name = name;
        this.singlePrice = singlePrice;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", singlePrice=" + singlePrice +
                ", amount=" + amount +
                '}';
    }
}
