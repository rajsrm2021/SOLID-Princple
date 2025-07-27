package SOLID_Princples.ISP;

import SOLID_Princples.ISP.Model.Airplane;
import SOLID_Princples.ISP.Model.Boat;
import SOLID_Princples.ISP.Service.VehicleService;
import SOLID_Princples.ISP.Model.Car;

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
