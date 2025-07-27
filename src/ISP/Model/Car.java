package ISP.Model;

import ISP.Vehicle.Drivable;
import ISP.Vehicle.IEnginePowered;

public class Car implements Drivable, IEnginePowered {
    @Override
    public void drive() {
        System.out.println("Car is Drive");
    }

    @Override
    public void powerOnEngine() {
        System.out.println("Car Power On Engine");
    }
}
