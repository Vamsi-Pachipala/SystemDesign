package DesignProblems.VendingMachineStateDesignPattern.Interface;

import DesignProblems.VendingMachineStateDesignPattern.Product;
import DesignProblems.VendingMachineStateDesignPattern.VendingMachine;

public interface VendingMachineState {
    void insertMoney(VendingMachine vendingMachine , double money);
    void selectProduct(VendingMachine vendingMachine , int id);
    Product dispense(VendingMachine vendingMachine);
}
