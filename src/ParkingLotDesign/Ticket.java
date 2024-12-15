package ParkingLotDesign;

import ParkingLotDesign.Vehicles.ParkingSpot;
import ParkingLotDesign.Vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private static int ticketCounter = 0;
    private final int ticketId;
    private final Vehicle vehicle;
    private final LocalDateTime entryTime;
    private final ParkingSpot spot;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ++ticketCounter;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}

