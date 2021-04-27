package Factory;

public class Main {

    public static void main(String[] args) {
        SimpleBakeryFactory factory = new SimpleBakeryFactory();
        BakeryShop bakery = new BakeryShop(factory);
        bakery.OrderBaking("Pizza");

    }
}
