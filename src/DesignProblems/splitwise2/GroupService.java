package DesignProblems.splitwise2;

import java.util.HashMap;
import java.util.Map;
public class GroupService {

    private final ExpenseService expenseSerive;
    Map<Integer, Group> groupMap;

    GroupService() {
        groupMap = new HashMap<>();
        expenseSerive = new ExpenseService();
    }

    void createGroup(int groupId, String groupName) {
        Group group = new Group(groupId, groupName);
        groupMap.put(groupId, group);
    }

    void addUserToGroup(int groupId, User user) {
        Group group = groupMap.get(groupId);
        if (group != null) {
            group.addUser(user);
        }
    }

    void addExpense(int groupId, int expenseId, String expenseName, double amount, User paidBy, SplitType splitType) {
        Group group = groupMap.get(groupId);
        if (group != null) {
            Expense expense = new Expense(expenseId, expenseName, amount, paidBy, splitType);
            expenseSerive.addExpense(expense, group);
            group.addExpense(amount);
        }
    }

    void showBalance(int groupId) {
        Group group = groupMap.get(groupId);
        if (group != null) {
            expenseSerive.showBalance(groupId);
            expenseSerive.nettingBalance(groupId);
        }
    }
}

