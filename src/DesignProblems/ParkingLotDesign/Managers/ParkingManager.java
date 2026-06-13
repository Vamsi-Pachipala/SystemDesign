package DesignProblems.ParkingLotDesign.Managers;

import DesignProblems.ParkingLotDesign.Vehicles.ParkingSpot;
import DesignProblems.ParkingLotDesign.Vehicles.Vehicle;

public interface ParkingManager {

    ParkingSpot findParkingSpot(Vehicle vehicle);

    void addParkingSpot(ParkingSpot parkingSpot);

    void removeParkingSpot(ParkingSpot parkingSpot);
}
