package VendingMachineStateDesignPattern.Interface;

import VendingMachineStateDesignPattern.Product;
import VendingMachineStateDesignPattern.VendingMachine;

public interface VendingMachineState {
    void insertMoney(VendingMachine vendingMachine , double money);
    void selectProduct(VendingMachine vendingMachine , int id);
    Product dispense(VendingMachine vendingMachine);
}
