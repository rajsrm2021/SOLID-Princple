package SOLID_Princples.ISP.Model;

import SOLID_Princples.ISP.Vehicle.IEnginePowered;
import SOLID_Princples.ISP.Vehicle.Sailable;

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
