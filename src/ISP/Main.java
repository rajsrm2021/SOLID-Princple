package ISP;

import ISP.Model.Airplane;
import ISP.Model.Boat;
import ISP.Service.VehicleService;
import ISP.Vehicle.IEnginePowered;
import ISP.Model.Car;

public class Main {
    public static void main(String[] args) {
        VehicleService service = new VehicleService();
        Car car = new Car();
        Boat boat = new Boat();
        Airplane plane = new Airplane();

        System.out.println("\n=== Car ===");
        service.StartEngin(car);
        service.DriveVehicle(car);

        System.out.println("\n=== Boat ===");
        service.StartEngin(boat);
        service.Sailable(boat);

        System.out.println("\n=== Airplane ===");
        service.StartEngin(plane);
        service.FlyVehicle(plane);
    }
}
