package Projekte.Testumgebung;

public class viewmodel {
    public static void main(String[] args) {
        Vehicle Tesla_Model_S = new Vehicle("Tesla", "Model S", FuelType.ELECTRIC, 1020, InteriorMaterial.LEATHER, ExteriorColor.BLACK);

        Tesla_Model_S.displayVehicleInfo();
    }
}
