package DesignProblems.Splitwise;

import java.util.List;

public class Group {

    List<User> members;

    int totalAmount;

    Group(List<User> members) {
        this.members = members;
        this.totalAmount = 0;
    }

    void updateTotalAmount(double amount) {
        this.totalAmount += amount;
    }

    void displayGroupBalanceSheet(){
        System.out.println("Total Spent in this Group " + totalAmount);
        for (User user : members) {
            user.display();
        }
    }
}
