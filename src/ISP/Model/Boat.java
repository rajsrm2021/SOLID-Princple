package ISP.Model;

import ISP.Vehicle.IEnginePowered;
import ISP.Vehicle.Sailable;

public class Boat implements Sailable, IEnginePowered {
    @Override
    public void powerOnEngine() {
        System.out.println("Boat powered on");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing");
    }
}
