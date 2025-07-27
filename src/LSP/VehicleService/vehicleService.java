package LSP.VehicleService;

import LSP.Vehicle.IEnginedPowered;
import LSP.Vehicle.IVehicle;

public class vehicleService {
    public void operateVehicle(IVehicle vehicle) {
        vehicle.move();

    }
    public void startWithEngin(IEnginedPowered engine) {
        engine.StartEngine();
        engine.move();
    }
}
