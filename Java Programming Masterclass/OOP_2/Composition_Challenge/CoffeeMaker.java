public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {
        ;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee...");
            hasWorkToDo = false;
        }
    }
}
