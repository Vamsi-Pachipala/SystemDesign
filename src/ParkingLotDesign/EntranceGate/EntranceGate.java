package ParkingLotDesign.EntranceGate;

import ParkingLotDesign.Managers.ParkingManager;
import ParkingLotDesign.ParkingStrategy.ParkingStrategy;
import ParkingLotDesign.Ticket;
import ParkingLotDesign.Vehicles.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

public class EntranceGate {
    private final ParkingStrategy strategy;

    public EntranceGate(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingManager parkingManager) {
        ParkingSpot spot = strategy.allocateSpot(vehicle, parkingManager);
        if (spot != null) {
            spot.parkVehicle(vehicle);
            return new Ticket(vehicle, spot);
        } else {
            System.out.println("No available spot for " + vehicle.getType());
            return null;
        }
    }
}
