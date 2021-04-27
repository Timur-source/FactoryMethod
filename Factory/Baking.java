package Factory;

abstract class Baking {
    String name;

    public void Sourdough() {
        System.out.println("Процесс закваски");
    }

    public void Kneading() {
        System.out.println("Перемешивание");
    }

    public void Rest() {
        System.out.println("Отдых");
    }

    public void Baking() {
        System.out.println("Запекание" + name);
    }

    public void cut() {
        System.out.println("Нарезание в форме ");
    }
}
