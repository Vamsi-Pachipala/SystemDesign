package DesignProblems.Elevator;

public class moveDown implements ElevatorState {
    @Override
    public void move(Elevator elevator) {
        // Move the elevator down
        elevator.moveDown();
    }
}
