package DesignProblems.splitwise2;

import java.util.ArrayList;
import java.util.List;
public class Group {

    int id;
    String name;

    double totalAmountSpent;
    List<User> users;

    Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
        totalAmountSpent = 0.0;
    }

    void addUser(User user) {
        this.users.add(user);
    }

    void removeUser(User user) {
        this.users.remove(user);
    }

    void addExpense(double amount) {
        totalAmountSpent += amount;
    }
}
