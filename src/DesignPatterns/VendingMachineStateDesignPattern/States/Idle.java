package DesignPatterns.VendingMachineStateDesignPattern.States;

import DesignPatterns.VendingMachineStateDesignPattern.Interface.VendingMachineState;
import DesignPatterns.VendingMachineStateDesignPattern.Product;
import DesignPatterns.VendingMachineStateDesignPattern.VendingMachine;

public class Idle implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachine vendingMachine ,double money) {
        System.out.println("adding money successful");
        vendingMachine.addBalance(money);
        vendingMachine.setCurrentState(new HasMoney());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine , int id){
        System.out.println("please add money before doing any operation");
    }

    @Override
    public Product dispense(VendingMachine vendingMachine) {
        System.out.println("please add money before doing any operation");
        return null;
    }
}
