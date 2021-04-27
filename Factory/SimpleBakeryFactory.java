package Factory;

public class SimpleBakeryFactory {
    public Baking createBakery (String type){
        Baking baking = null;
        if ("Bread".equals(type)) {
            baking = new Bread();
            System.out.println("Готовится хлеб");
        } else if ("Cake".equals(type)) {
            baking = new Cake();
            System.out.println("Готовится торт");
        } else if ("Pizza".equals(type)) {
            baking = new Pizza();
            System.out.println("Готовится пицца");
        }
return baking;
    }

}
