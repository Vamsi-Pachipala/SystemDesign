package DesignProblems.Splitwise;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitStartegy implements SpliterStrategy {
    @Override
    public List<Split> split(Expense expense) {
        Group group = expense.group;
        double amount = expense.amount;
        int numberOfUsers = group.members.size();
        System.out.println("Number of Users in the Group " + numberOfUsers);
        double splitAmount = amount / numberOfUsers;
        System.out.println("Split Amount for each user " + splitAmount);
        List<Split> splits = new ArrayList<>();
        for (User user : group.members) {
            if (!user.equals(expense.paidBy)) {
                Split split = new Split(user, splitAmount);
                splits.add(split);
                //user.updateBalance(split);
            }
        }

        return splits;
    }

}
