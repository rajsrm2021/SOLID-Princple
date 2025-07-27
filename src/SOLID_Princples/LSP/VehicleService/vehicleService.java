package SOLID_Princples.LSP.VehicleService;

import SOLID_Princples.LSP.Vehicle.IEnginedPowered;
import SOLID_Princples.LSP.Vehicle.IVehicle;

public class vehicleService {
    public void operateVehicle(IVehicle vehicle) {
        vehicle.move();

    }
    public void startWithEngin(IEnginedPowered engine) {
        engine.StartEngine();
        engine.move();
    }
}
