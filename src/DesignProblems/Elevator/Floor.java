package DesignProblems.Elevator;

public class Floor {
    private int floorNumber;
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void updateDisplay(String id , Direction direction , int floorNumber) {
        System.out.println("Elevator " + id + " is at floor " + floorNumber + " moving " + direction);
    }
}
