package Factory;

public class Bread extends Baking {
    public Bread() {
        name = " хлеба";
    }

    @Override
    public void cut() {
        System.out.println("Режется прямоугольником");
    }
}


