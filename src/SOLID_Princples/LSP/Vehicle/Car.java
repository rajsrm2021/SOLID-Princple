package SOLID_Princples.LSP.Vehicle;

public class Car implements IEnginedPowered{
    @Override
    public void StartEngine() {
        System.out.println("Car start");
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }
}
