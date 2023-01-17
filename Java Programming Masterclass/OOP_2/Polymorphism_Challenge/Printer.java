public class Car {

    private String description;

    public Car() {
        ;
    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the car");
    }

    public void drive() {
        System.out.println("Driving the car");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running the engine of the car");
    }

    public static Car getCar(String carType, String description) {
        return switch (carType.toLowerCase().charAt(0)) {
            case 'g' -> new GasPoweredCar(description);
            case 'e' -> new ElectricCar(description);
            case 'h' -> new HybridCar(description);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting the engine of the gas powered car");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving the gas powered car");
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting the engine of the electric car");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving the electric car");
    }

    @Override
    protected void runEngine() {
        System.out.println("Running the engine of the electric car");
    }

    public void driveElectric() {
        System.out.println("Driving the brand new electric car!");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting the engine of the hybrid car");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving the hybrid car");
    }
}
