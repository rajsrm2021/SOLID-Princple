package LSP;
import LSP.Vehicle.Bicycle;
import LSP.Vehicle.Car;
import LSP.VehicleService.vehicleService;

public class Main {
    public static void main(String[] args) {
        vehicleService service = new vehicleService();

        service.operateVehicle(new Bicycle());
        service.startWithEngin(new Car());
    }
}
