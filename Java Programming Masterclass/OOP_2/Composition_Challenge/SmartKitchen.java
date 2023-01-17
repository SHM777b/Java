public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Dishwasher dishwasher;
    private Refrigerator refrigerator;

    public SmartKitchen() {
        // The assumption is that the smart kitchen comes with standard set of appliances.
        // Hence, the constructor does not require the objects as input instead initialized
        // them automatically at the start with default values of the fields.
        coffeeMaker = new CoffeeMaker();
        dishwasher = new Dishwasher();
        refrigerator = new Refrigerator();
    }


    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishwasher.setHasWorkToDo(true);
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void doKitchenWork(String string) {
        switch (string) {
            case "coffeemaker":
                coffeeMaker.brewCoffee();
                break;
            case "refrigerator":
                dishwasher.doDishes();
                break;
            case "dishwasher":
                refrigerator.orderFood();
                break;
            default:
                System.out.println("Please provide the name of the appliance to execute the command");
        }
    }
}
