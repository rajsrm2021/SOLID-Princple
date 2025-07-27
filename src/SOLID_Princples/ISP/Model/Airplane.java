package SOLID_Princples.ISP.Model;

import SOLID_Princples.ISP.Vehicle.Flyable;
import SOLID_Princples.ISP.Vehicle.IEnginePowered;

public class Airplane implements Flyable, IEnginePowered {

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void powerOnEngine() {
        System.out.println("Airplane engine started");
    }
}
