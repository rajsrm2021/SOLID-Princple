package SOLID_Princples.ISP.Model;

import SOLID_Princples.ISP.Vehicle.Drivable;
import SOLID_Princples.ISP.Vehicle.IEnginePowered;

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
