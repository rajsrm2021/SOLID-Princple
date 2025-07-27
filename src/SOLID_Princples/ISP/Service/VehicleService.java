package SOLID_Princples.ISP.Service;

import SOLID_Princples.ISP.Vehicle.Drivable;
import SOLID_Princples.ISP.Vehicle.Flyable;
import SOLID_Princples.ISP.Vehicle.IEnginePowered;
import SOLID_Princples.ISP.Vehicle.Sailable;

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
