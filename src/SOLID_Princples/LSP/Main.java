package SOLID_Princples.LSP;
import SOLID_Princples.LSP.Vehicle.Bicycle;
import SOLID_Princples.LSP.Vehicle.Car;
import SOLID_Princples.LSP.VehicleService.vehicleService;

public class Main {
    public static void main(String[] args) {
        vehicleService service = new vehicleService();

        service.operateVehicle(new Bicycle());
        service.startWithEngin(new Car());
    }
}
