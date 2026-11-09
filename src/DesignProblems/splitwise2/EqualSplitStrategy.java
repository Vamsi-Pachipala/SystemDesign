package DesignProblems.splitwise2;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitStrategy implements SplitTypeStrategy {

    @Override
    public List<Split> calculateSplit(Expense expense , Group group) {
        double totalAmount = expense.amount;
        int numberOfUsers = group.users.size();
        double splitAmount = totalAmount / numberOfUsers;

        List<Split> splits = new ArrayList<>();
        for (User user : group.users) {
            splits.add(new Split(user, splitAmount));
        }

        return splits;
    }
}
