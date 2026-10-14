package DesignProblems.Splitwise;

import java.util.HashMap;

public class User {
    int id;

    String name;

    String mobileNumber;

    HashMap<User, Double> balanceSheet = new HashMap<>();

    public User(int id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void updateBalance(Split split, User paidBy) {
        balanceSheet.put(paidBy, balanceSheet.getOrDefault(paidBy, 0.0) + split.amount);
    }

    public void display(){
        for (User user : balanceSheet.keySet()) {
            System.out.println(this.name + " Owes " + user.getName() + ": " + balanceSheet.get(user));
        }
    }
}
