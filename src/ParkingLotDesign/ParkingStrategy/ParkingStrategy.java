package ParkingLotDesign.ParkingStrategy;

import ParkingLotDesign.Managers.ParkingManager;
import ParkingLotDesign.Vehicles.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

public interface ParkingStrategy {
    ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager);
}