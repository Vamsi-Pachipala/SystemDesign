package DesignProblems.Elevator;

public class MovingUpState implements ElevatorState {
    @Override
    public void move(Elevator elevator) {
        // Move the elevator up
        elevator.moveUp();
    }
}
