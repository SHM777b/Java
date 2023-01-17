public class Main {

    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        // One way to set the hasWorkToDo field of each appliance is via getters and setters
        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
        smartKitchen.getDishwasher().setHasWorkToDo(true);
        smartKitchen.getRefrigerator().setHasWorkToDo(true);

        smartKitchen.getCoffeeMaker().setHasWorkToDo(false);
        smartKitchen.getDishwasher().setHasWorkToDo(false);
        smartKitchen.getRefrigerator().setHasWorkToDo(false);

        // An alternative way is via a predefined method in SmartKitchen class
        smartKitchen.addWater();
        smartKitchen.loadDishwasher();
        smartKitchen.pourMilk();


        System.out.printf("Coffeemaker has work to do: %b%n", smartKitchen.getCoffeeMaker().getHasWorkToDo());
        System.out.printf("Dishwasher has work to do:  %b%n", smartKitchen.getDishwasher().getHasWorkToDo());
        System.out.printf("Refrigerator has work to do: %b%n", smartKitchen.getRefrigerator().getHasWorkToDo());

        // Now let's access each appliance's internal methods through getters
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishwasher().doDishes();
        smartKitchen.getRefrigerator().orderFood();

        // Next let's do the same thing via doKitchenWork() method
        smartKitchen.doKitchenWork("refrigerator");

    }
}
