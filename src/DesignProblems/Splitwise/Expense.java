package DesignProblems.Splitwise;

public class Expense {
    Group group;

    User paidBy;

    double amount;

    public Expense(Group groupId, User paidBy, double amount) {
        this.group = groupId;
        this.paidBy = paidBy;
        this.amount = amount;
    }
}
