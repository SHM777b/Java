public class Main {

    public static void main(String[] args) {
       var unknownObject = Car.getCar("E", "Tesla");
       printClass(unknownObject);
       unknownObject.drive();
       unknownObject.runEngine();
       ElectricCar ev = (ElectricCar) unknownObject;
       System.out.println("Casting into ElectricCar data type. Now ElectricCar specific methods will run");
       ev.driveElectric();
       ev.runEngine();
    }

    public static void printClass(Car carObject) {
        System.out.printf("The type of the object is %s%n",
                          carObject.getClass().getSimpleName());
    }
}
