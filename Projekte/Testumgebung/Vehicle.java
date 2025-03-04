package Projekte.Testumgebung;
// Enum for fuel types
enum FuelType {
    GASOLINE, DIESEL, ELECTRIC, HYBRID
}

// Enum for interior materials
enum InteriorMaterial {
    LEATHER, FABRIC, SYNTHETIC
}

// Enum for exterior colors
enum ExteriorColor {
    RED, BLUE, BLACK, WHITE, SILVER
}

// Vehicle Class
public class Vehicle {
    // Member variables
    private String brand;
    private String model;
    private Engine engine;
    private Interior interior;
    private Exterior exterior;

    // Constructor
    public Vehicle(String brand, String model, FuelType fuelType, int horsepower, InteriorMaterial material, ExteriorColor color) {
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(fuelType, horsepower);
        this.interior = new Interior(material);
        this.exterior = new Exterior(color);
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        engine.displayEngineInfo();
        interior.displayInteriorInfo();
        exterior.displayExteriorInfo();
    }

    // Engine Class (Nested)
    public class Engine {
        private FuelType fuelType;
        private int horsepower;

        // Constructor
        public Engine(FuelType fuelType, int horsepower) {
            this.fuelType = fuelType;
            this.horsepower = horsepower;
        }

        // Method to display engine info
        public void displayEngineInfo() {
            System.out.println("Engine: " + horsepower + " HP, Fuel Type: " + fuelType);
        }
    }

    // Interior Class (Nested)
    public class Interior {
        private InteriorMaterial material;

        // Constructor
        public Interior(InteriorMaterial material) {
            this.material = material;
        }

        // Method to display interior info
        public void displayInteriorInfo() {
            System.out.println("Interior: " + material + " material");
        }
    }

    // Exterior Class (Nested)
    public class Exterior {
        private ExteriorColor color;

        // Constructor
        public Exterior(ExteriorColor color) {
            this.color = color;
        }

        // Method to display exterior info
        public void displayExteriorInfo() {
            System.out.println("Exterior Color: " + color);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Tesla", "Model S", FuelType.ELECTRIC, 1020, InteriorMaterial.LEATHER, ExteriorColor.BLACK);
        vehicle.displayVehicleInfo();
    }
}
