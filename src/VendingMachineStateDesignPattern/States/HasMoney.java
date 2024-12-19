package VendingMachineStateDesignPattern.States;

import VendingMachineStateDesignPattern.Interface.VendingMachineState;
import VendingMachineStateDesignPattern.Product;
import VendingMachineStateDesignPattern.VendingMachine;

public class HasMoney implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine vendingMachine , double money) {
        System.out.println("added money again");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine , int id) {
        System.out.println("selection of the product");
        vendingMachine.setCurrentState(new Dispense(id));
    }
    @Override
    public Product dispense(VendingMachine vendingMachine) {
        return null;
    }
}
