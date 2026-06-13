package DesignPatterns.VendingMachineStateDesignPattern.Interface;

import DesignPatterns.VendingMachineStateDesignPattern.Product;
import DesignPatterns.VendingMachineStateDesignPattern.VendingMachine;

public interface VendingMachineState {
    void insertMoney(VendingMachine vendingMachine , double money);
    void selectProduct(VendingMachine vendingMachine , int id);
    Product dispense(VendingMachine vendingMachine);
}
