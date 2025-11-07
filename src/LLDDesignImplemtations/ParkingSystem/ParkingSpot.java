package LLDDesignImplemtations.ParkingSystem;

public class ParkingSpot {

    private int id;
    private boolean isAvailable;
    private  VehicleType type;
    private Vehicle parkedVehicle;

    public ParkingSpot(int id, VehicleType v)
    {
        this.id= id;
        this .type = v;
    }

    public boolean isAvailable() {return isAvailable;}
    public VehicleType getType(){return type;}
    public int getId() {return  id;}

    public void parkVehicle(Vehicle v)
    {
        this.parkedVehicle =v;
        this.isAvailable = false;
    }
    public void vacate()
    {
        this.parkedVehicle = null;
        this.isAvailable = true;
    }


}
