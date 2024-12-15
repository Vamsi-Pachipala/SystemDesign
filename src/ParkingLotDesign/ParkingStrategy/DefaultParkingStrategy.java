package ParkingLotDesign.ParkingStrategy;

import ParkingLotDesign.Managers.ParkingManager;
import ParkingLotDesign.Vehicles.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager) {
        return manager.findParkingSpot(vehicle);
    }
}
