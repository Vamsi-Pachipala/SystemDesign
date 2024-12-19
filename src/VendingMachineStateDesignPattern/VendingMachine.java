package VendingMachineStateDesignPattern;

import VendingMachineStateDesignPattern.Interface.VendingMachineState;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    Map<Integer, Product> productInventory;

    private Double totalMoney = 0.0;

    VendingMachineState currentVendingMachineState;

    public VendingMachine(VendingMachineState currentVendingMachineState) {
        this.currentVendingMachineState = currentVendingMachineState;
        productInventory = new HashMap<>();
    }

    VendingMachineState getCurrentState() {
        return currentVendingMachineState;
    }

    public void setCurrentState(VendingMachineState vendingMachineState) {
        currentVendingMachineState = vendingMachineState;
    }

    public double getBalance() {
        return totalMoney;
    }

    void cancel() {
        System.out.println("you cancelled the process , press on refund for refund of your money");
    }

    double refund() {
        System.out.println("clicked on the refund , wait for refund it will take some time");
        if (totalMoney <= 0) {
            System.out.println("you don't have money for refund , if you have any concern please connect with support team");
            return 0.0;
        }
        return totalMoney;
    }

    void addProduct(Product product) {
        productInventory.put(product.id, product);
    }

    public void addBalance(double amount) {
        this.totalMoney += amount;
    }

    Product dispense() {
        return currentVendingMachineState.dispense(this);
    }

    void insertMoney(double money) {
        this.currentVendingMachineState.insertMoney(this, money);
    }

    public void deductBalance(double amount) {
        this.totalMoney -= amount;
    }

    void selectProduct(int id) {
        currentVendingMachineState.selectProduct(this, id);
    }

    public boolean isProductAvailable(int productCode) {
        return this.productInventory.containsKey(productCode);
    }

    public double getProductPrice(int productCode) {
        return this.productInventory.get(productCode).price;
    }

    public Product getProduct(int id) {
        return this.productInventory.get(id);
    }
}
