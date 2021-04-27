package Factory;

public class Pizza extends Baking {
public Pizza () {
    name = " пиццы";
}

    @Override
    public void cut() {
        System.out.println("Нарезание в форме треугольника");
    }
}
