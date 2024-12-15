package ParkingLotDesign.ExitGate;

import ParkingLotDesign.Ticket;
import ParkingLotDesign.Vehicles.ParkingSpot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    public double calculateCharge(Ticket ticket, double ratePerHour) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long hoursParked = Math.max(1, Duration.between(entryTime, exitTime).toHours()); // At least 1 hour
        return hoursParked * ratePerHour;
    }

    public void processExit(Ticket ticket, double ratePerHour) {
        double charge = calculateCharge(ticket, ratePerHour);
        System.out.println("Ticket ID: " + ticket.getTicketId() + " | Charge: $" + charge);

        ParkingSpot spot = ticket.getSpot();
        spot.vacateSpot();
    }
}

