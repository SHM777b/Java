public class Dishwasher {

    private boolean hasWorkToDo;

    public Dishwasher() {
        ;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes now...");
            hasWorkToDo = false;
        }
    }
}
