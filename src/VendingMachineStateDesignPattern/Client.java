package VendingMachineStateDesignPattern;

import VendingMachineStateDesignPattern.States.Idle;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new Idle());


        vendingMachine.addProduct(new Product(1 , "apple" , 10.0));
        vendingMachine.addProduct(new Product(2 , "orange" , 20.0));
        vendingMachine.addProduct(new Product(3 , "chocolate" , 20));

        vendingMachine.insertMoney(100.0);
        vendingMachine.selectProduct(1);
        Product product  = vendingMachine.dispense();
        System.out.println(product.id +"  ---> "+ product.name);

        System.out.println(vendingMachine.getBalance());
    }
}
