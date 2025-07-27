package ISP.Model;

import ISP.Vehicle.Flyable;
import ISP.Vehicle.IEnginePowered;

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
