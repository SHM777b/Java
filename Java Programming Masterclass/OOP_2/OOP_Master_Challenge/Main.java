public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();
    }
}
