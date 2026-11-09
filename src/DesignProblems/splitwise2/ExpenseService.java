package DesignProblems.splitwise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseService {

    Map<Integer , List<Expense>> expenseMap; // groupId -> expense

    BalanceService balanceService;


    ExpenseService() {
        expenseMap = new HashMap<>();
        balanceService = new BalanceService();
    }
    public void addExpense(Expense expense , Group group) {
        expenseMap.computeIfAbsent(group.id, k -> new ArrayList<>()).add(expense);
        // here I just implemented equal split type strategy, you can implement other strategies as well
        // you can use factory pattern to create different split type strategies based on the split type of the expense
        // no need to have a separate method for each split type strategy, you can have a single method that takes the split type as a parameter and returns the appropriate strategy
        SplitTypeStrategy splitTypeStrategy = SplitTypeStrategyFactory.getSplitTypeStrategy(expense.splitType);
        List<Split> splits = splitTypeStrategy.calculateSplit(expense, group);
        balanceService.updateBalance(group.id , expense.paidBy, splits);

    }

    public void showBalance(int groupId) {
        balanceService.showBalanceSheet(groupId);
    }

    public void nettingBalance(int groupId) {
        balanceService.nettingBalanceSheet(groupId);
    }
}
