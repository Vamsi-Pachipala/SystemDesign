package ParkingLotDesign.Managers;

import ParkingLotDesign.Vehicles.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

public interface ParkingManager {

    ParkingSpot findParkingSpot(Vehicle vehicle);

    void addParkingSpot(ParkingSpot parkingSpot);

    void removeParkingSpot(ParkingSpot parkingSpot);
}
