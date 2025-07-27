package ISP.Service;

import ISP.Vehicle.Drivable;
import ISP.Vehicle.Flyable;
import ISP.Vehicle.IEnginePowered;
import ISP.Vehicle.Sailable;

public class VehicleService {
    public void StartEngin(IEnginePowered vehicle) {
        vehicle.powerOnEngine();
    }
    public void DriveVehicle(Drivable vehicle) {
        vehicle.drive();
    }
    public void FlyVehicle(Flyable vehicle) {
        vehicle.fly();
    }
    public void Sailable(Sailable vehicle) {
        vehicle.sail();
    }
}
