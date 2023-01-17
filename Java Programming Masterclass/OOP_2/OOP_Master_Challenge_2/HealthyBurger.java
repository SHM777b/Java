public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double basePrice = super.itemizeHamburger();
        if (healthyExtra1Price != 0) {
            System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name, healthyExtra1Price);
        }
        if (healthyExtra2Price != 0) {
            System.out.printf("Added %s for an extra %.2f %n", healthyExtra2Name, healthyExtra2Price);
        }
        return basePrice + healthyExtra1Price + healthyExtra2Price;
    }
}
