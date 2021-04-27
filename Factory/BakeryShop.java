package Factory;

public class BakeryShop {
    private final SimpleBakeryFactory bakeryFactory;

    public BakeryShop(SimpleBakeryFactory bakeryFactory) {
        this.bakeryFactory = bakeryFactory;
    }
public Baking OrderBaking(String type) {
        Baking baking;
       baking = bakeryFactory.createBakery(type);
       baking.Sourdough();
       baking.Kneading();
       baking.Rest();
       baking.Baking();

    System.out.println("Ваш заказ готов!");
    return baking;
}
}
