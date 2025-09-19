package decorator;

public class TestCoffe {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.GRANDE);
        Beverage soy = new Soy(espresso);
        System.out.println(soy.getDescription());
        System.out.println((double) (Math.round(soy.cost() * 100)) /100);
    }
}
