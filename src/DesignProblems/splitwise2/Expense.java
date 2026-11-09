package DesignProblems.splitwise2;

public class Expense {

    int id;
    double amount;
    User paidBy;
    SplitType splitType;
    String name;

    Expense(int id, String name, double amount, User paidBy, SplitType splitType) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitType = splitType;
    }
}
